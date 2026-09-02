class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);

            }else{
                neg.add(nums[i]);
            }
        }

        int j=0;

        int[] res= new int[nums.length];
        for(int i=0;i<pos.size();i++){
            res[j++]=pos.get(i);
            res[j++]=neg.get(i);

        }

        return res;
       
        
    }
}