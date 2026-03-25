class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
         for(char c :s.toCharArray()){
         if(c=='(' || c=='{' || c=='[' ){
            stack.push(c);
         }
         else{
            if(stack.isEmpty()) return false;
            char top = stack.pop();
            if(c==')' && top!='(') return false;
            if(c==']' && top!='[') return false;
            if(c=='}' && top!='{') return false;
         }
         }
         return stack.isEmpty();

        
    }
}
/* Using HashMap

HashMap<Character,Character> mappedBracket= new HashMap<>();

        mappedBracket.put(')','(');
        mappedBracket.put('}','{');
        mappedBracket.put(']','[');

        Stack<Character> stack= new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(!mappedBracket.containsKey(c)){
                stack.push(c);
            }
            else{
                if(stack.empty()){
                    return false;
                }
                char topElement=stack.pop();
                if(topElement != mappedBracket.get(c)){
                    return false;
                }
            }
        }
          return stack.isEmpty();

          */