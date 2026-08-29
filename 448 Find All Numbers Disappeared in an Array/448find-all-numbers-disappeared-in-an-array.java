class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        int n = nums.length;

        List<Integer> result = new ArrayList<>();

        for(int num : nums) {
            hs.add(num);
        }

        for(int i = 1; i <= n; i++) {
            if(!hs.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {

//         //remove
//         for(int num : nums){
//             System.out.print(num + " ");
//         }
//         //remove
//         System.out.println(" ");

//         HashSet<Integer> hs= new HashSet<>();
//         int n=nums.length;

//         List<Integer> result= new ArrayList<>();


//         for(int i=0;i<n;i++){
//             hs.add(nums[i]);
//         }
//         //remove
//         for(int i=0;i<nums.length;i++){
           
//             if(!hs.contains(i)){
//                 result.add(i);
//             }
//         }

        
//         return result;
        
//     }
// }