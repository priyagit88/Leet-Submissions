class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        
        int stable;

        for(int i=0;i<n;i++){
            maxi= Math.max( maxi, nums[i]);
             int mini = Integer.MAX_VALUE;

            for(int j=i;j<n;j++){
                mini= Math.min(mini,nums[j]);
            }

                stable=maxi-mini;
                if(stable<=k){
                    return i;
                }


            
           

        }
         return -1;
        
    }
}