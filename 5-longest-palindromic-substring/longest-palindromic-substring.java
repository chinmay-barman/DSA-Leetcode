class Solution {
    public boolean checkPalindrome(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String  maxStr = "";
        for(int i=0;i<s.length();i++){
            for(int j=i+maxStr.length();j<=s.length();j++){
                String subStr = s.substring(i,j);
                if(checkPalindrome(subStr)){
                    if(subStr.length()>maxStr.length()){
                        maxStr = subStr;
                    }
                }
            }
        }
        return maxStr;
    }
}