class Solution {
    public boolean check(int[] nums) {

        int dropcount=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                dropcount++;
            }
        }
        if(nums[nums.length-1]>nums[0]){
            dropcount++;
        }
        return dropcount<=1;
        
        
       
    }
}