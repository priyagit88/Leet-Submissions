class Solution {
    public int strStr(String haystack, String needle) {
        
        int i=0;
        int j=0;
        int start=0;
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(j==0){
                    start=i;
                }
                i++;
                j++;
                if(j==needle.length()){
                    return start;
                }
            }else{
                if(j>0){
                i=start+1;
                j=0;
                }else{
                    i++;
                }
            }
        }
        return -1;

    }
}