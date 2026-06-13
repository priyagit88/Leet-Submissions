class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        // Fill with amount + 1 (acts like infinity)
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int c : coins) {
            for (int a = c; a <= amount; a++) {
                dp[a] = Math.min(dp[a], dp[a - c] + 1);
            }
        }

        if (dp[amount] > amount) {
            return -1;
        }

        return dp[amount];
    }
}