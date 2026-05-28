class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        char ch = s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                ch = s.charAt(i);
                break;
            }
            else{
                set.add(s.charAt(i));
            }
        }
        return ch;
    }
}