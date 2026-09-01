class Solution {
    public int dominantIndex(int[] nums) {

        int index=0;

        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;

            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=index && max<2 *nums[i]){
                return -1;
            }

        }
        return index;
        
    }
}