class Solution {
    public String largestOddNumber(String num) {
        int right = num.length()-1;
        String ans = "";
        while(right>=0){
            if((int)num.charAt(right)%2==0){
                right--;
            }
            else{
                ans = num.substring(0,right+1);
                break;
            }
        }
        return ans;
        
    }
}