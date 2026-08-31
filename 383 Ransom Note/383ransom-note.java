class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if(!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if(map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return true;
    }
}

/*
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // Count characters in magazine
        for(int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        // Use characters for ransomNote
        for(int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';

            count[index]--;

            if(count[index] < 0) {
                return false;
            }
        }

        return true;
    }
}

*/