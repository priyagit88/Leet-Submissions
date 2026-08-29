class Solution {
    public int findDuplicate(int[] nums) {

        int n=nums.length;

        for(int i :nums){
            System.out.print( i + " ");
        }
        Arrays.sort(nums);
        System.out.println( " ");
         for(int i :nums){
            System.out.print( i + " ");
        }

        int prev=nums[0];
        for(int i =1;i<n;i++){
            if(prev==nums[i]){
               System.out.println( " ");
                System.out.println( prev + " " + nums[i]);
              
               
                return prev;
            }
            prev=nums[i];
        }
        return n;
        
    }
}