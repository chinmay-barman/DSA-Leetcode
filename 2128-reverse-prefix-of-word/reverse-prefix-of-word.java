class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        int left = 0;
        int right = 0;
        while(true){
            if(right>=word.length()){
                return word;
            }
            else if(word.charAt(right)==ch){
                break;
            }
            right++;
        }
        while(left<right){
            char temp = sb.charAt(left);
            sb.setCharAt(left,sb.charAt(right));
            sb.setCharAt(right,temp);
            left++;
            right--;
        }
        return sb.toString();
    }
}