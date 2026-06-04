class Solution {
    public int waviness(int n){
        String s = Integer.toString(n);
        int count = 0;
        for(int i = 1;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i-1) && s.charAt(i)>s.charAt(i+1)){
                count++;
            }
            else if(s.charAt(i)<s.charAt(i-1) && s.charAt(i)<s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
    public int totalWaviness(int num1, int num2) {
        int sum = 0;
        for(int i=num1;i<=num2;i++){
            sum += waviness(i);
        }
        return sum;
    }
}