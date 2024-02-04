class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int hash[265]={0};
        bool tMapped[256]={0};
        for(int i=0;i<s.size();i++){
            if(hash[s[i]]==0 && tMapped[t[i]]==0){
                hash[s[i]]=t[i];
                tMapped[t[i]]=true;
            }
        }
        for(int i=0;i<s.size();i++){
            if(char(hash[s[i]])!=t[i]){
                return false;
            }
          
        }
       return true;
    }
};