class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        
        int minvalue=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
              int distance= Math.abs(i-start);
              minvalue=Math.min(minvalue,distance);
            }
        }
        return minvalue;
    }
}