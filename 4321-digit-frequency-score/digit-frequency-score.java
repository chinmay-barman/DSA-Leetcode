class Solution {
    public int digitFrequencyScore(int n) {
        int temp =n;
        int ans = 0;
        while(temp!=0){
            int last = temp%10;
            ans+=last;
            temp /=10;
        }
        return ans;
    }
}