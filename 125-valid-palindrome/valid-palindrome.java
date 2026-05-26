class Solution {
    public boolean isPalindrome(String s) {
        String newStr = "";
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                newStr+=ch;
            }
        }
        String reversed = new StringBuilder(newStr).reverse().toString();
        return newStr.equals(reversed);
    }
}