class Solution {
public:
    bool isovel(char ch){
        ch=tolower(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ;
    }
    string reverseVowels(string s) {
        int l=0;
        int h=s.size()-1;
        while(l<h){
            if(isovel(s[l]) && isovel(s[h])){
                swap(s[l],s[h]);
                l++,h--;
            }
            else if(isovel(s[l])==0){
                l++;
            }
            else{
                h--;
            }
        }
        return s;
    }
};