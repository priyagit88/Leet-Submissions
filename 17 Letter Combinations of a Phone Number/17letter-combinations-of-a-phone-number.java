class Solution {
    private String[] digitToLetters={ "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> combination = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return combination;
        }
        backtrack(combination,digits,"",0);
        return combination;
    }

    private void backtrack (List<String> combination,String digits,String currentCombination,int index){
        if(index==digits.length()){
            combination.add(currentCombination);
            return;
        }

        String letters = digitToLetters[digits.charAt(index) - '0'];
        for(char letter : letters.toCharArray()){
            backtrack(combination,digits,currentCombination + letter ,index+1);
        }
    }      

        
        
    }
