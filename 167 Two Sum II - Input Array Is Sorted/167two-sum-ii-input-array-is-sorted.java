class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            int remaining = target - numbers[i];
            if(map.containsKey(remaining)){
                return new int[] {map.get(remaining),i+1};
            }
            map.put(numbers[i],i+1);
        }
        return new int[] {};
    }
}