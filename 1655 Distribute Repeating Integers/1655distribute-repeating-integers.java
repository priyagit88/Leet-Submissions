class Solution {

    int[] count;
    int[] subsetSum;
    int m;
    Boolean[][] memo;

    public boolean canDistribute(int[] nums, int[] quantity) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        count = new int[map.size()];
        int idx = 0;

        for (int freq : map.values()) {
            count[idx++] = freq;
        }

        Arrays.sort(quantity);

        // descending order
        for (int i = 0, j = quantity.length - 1; i < j; i++, j--) {
            int temp = quantity[i];
            quantity[i] = quantity[j];
            quantity[j] = temp;
        }

        m = quantity.length;

        int totalMasks = 1 << m;

        subsetSum = new int[totalMasks];

        for (int mask = 1; mask < totalMasks; mask++) {

            int bit = Integer.numberOfTrailingZeros(mask);

            subsetSum[mask] =
                subsetSum[mask ^ (1 << bit)] + quantity[bit];
        }

        memo = new Boolean[count.length + 1][totalMasks];

        return dfs(0, 0);
    }

    private boolean dfs(int i, int mask) {

        if (mask == (1 << m) - 1)
            return true;

        if (i == count.length)
            return false;

        if (memo[i][mask] != null)
            return memo[i][mask];

        // skip current frequency bucket
        if (dfs(i + 1, mask))
            return memo[i][mask] = true;

        int remaining =
            ((1 << m) - 1) ^ mask;

        for (int sub = remaining; sub > 0; sub = (sub - 1) & remaining) {

            if (subsetSum[sub] <= count[i]) {

                if (dfs(i + 1, mask | sub)) {
                    return memo[i][mask] = true;
                }
            }
        }

        return memo[i][mask] = false;
    }
}