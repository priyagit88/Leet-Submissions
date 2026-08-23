class Solution {
    public int[] sortedSquares(int[] nums) {
        

        int left=0;
        int right=nums.length-1;
        int[] result = new int[nums.length];
        int k=nums.length-1;

        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[k]=nums[left] * nums[left];
                System.out.println( result[k]);
                left++;

            }
            else{
                result[k]=nums[right]*nums[right];
                System.out.println( result[k]);
                right--;

               
            }
            k--;
        }
        return result;
    }
}