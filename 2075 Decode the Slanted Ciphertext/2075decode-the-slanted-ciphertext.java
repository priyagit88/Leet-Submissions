class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
          if(rows==0)return "";

          int n=encodedText.length();
          int cols=n/rows;

          StringBuilder result= new StringBuilder();

          for(int x=0;x<cols;x++){
            int i=0;
            int j=x;

            while(i<rows && j<cols){
                result.append(encodedText.charAt(i*cols+j));
                i++;
                j++;
            }

          }

          int end=result.length()-1;
          while(end>=0 && result.charAt(end)==' '){
            end--;
          }
          return result.substring(0,end+1);

        
    }
} 