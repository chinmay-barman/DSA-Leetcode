class Solution {
    public int getLucky(String s, int k) {
        String num = "";
        for(int i=0;i<s.length();i++){
            num += Integer.toString(s.charAt(i)-'a'+1);
        }
        for(int i=0;i<k;i++){
            int n = 0;
            for(int j=0;j<num.length();j++){
                n+=(num.charAt(j)-'0');
            }
            num = Integer.toString(n);
        }
        return Integer.parseInt(num);
    }
}