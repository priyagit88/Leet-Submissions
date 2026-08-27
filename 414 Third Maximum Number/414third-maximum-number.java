class Solution {
    public int thirdMax(int[] nums) {
        
        long m1=Long.MIN_VALUE;
        long m2=Long.MIN_VALUE;
        long m3=Long.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==m1 || nums[i]==m2 || nums[i]==m3 ){
                continue;
            }
            if(nums[i]>m1){
                System.out.println(nums[i]);
                m3=m2;
                System.out.println(m3);
                m2=m1;
                System.out.println(m2);
                m1=nums[i];
                System.out.println(m1);

            }
            else if(nums[i]>m2 && nums[i]<m1){
                m3=m2;
                System.out.println(m3);
                m2=nums[i];
                System.out.println(m2);

            }
             else if(nums[i]>m3 && nums[i]<m2){
              
                m3=nums[i];
                System.out.println(m3);

            }
        }
        if(m3==Long.MIN_VALUE){
        return (int)m1;
        }
        return (int)m3;

    }
}