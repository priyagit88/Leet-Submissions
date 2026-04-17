class Solution {
    public int minAbsoluteDifference(int[] nums) {
        
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==1 && nums[j]==2){
                    int diff=Math.abs(i-j);
                    mindiff=Math.min(diff,mindiff);
                }
            }
        }
         return mindiff!=Integer.MAX_VALUE?mindiff:-1;

    }
}
/*
 int mindiff=Integer.MAX_VALUE;
        boolean foundi=false;
        boolean foundj=false;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                foundi=true;
            }
            for(int j=0;j<nums.length;j++){
                if(nums[j]==2){
                    foundj=true;
                
                if(nums[i]==1 && nums[j]==2){
                    int diff=Math.abs(i-j);
                    mindiff=Math.min(diff,mindiff);
                }
            }
        }
        }
        if(foundi==false|| foundj==false){
            return -1;
        }
        else{
            return mindiff;
        }
        */