class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                result.add(nums[i]);
            }
        }
        return result;
        
    }
}