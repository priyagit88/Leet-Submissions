class Solution {
    public String reverseOnlyLetters(String s) {
        int left=0;
        int right=s.length()-1;

        char[] arr= s.toCharArray();
        
        while(left<right){
           if(!Character.isLetter(arr[left])){
            left++;
           }
           else if(!Character.isLetter(arr[right])){
            right--;
        }
        else{
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
            System.out.println(new String(arr));
        }

    }
    return new String(arr);
    }
}