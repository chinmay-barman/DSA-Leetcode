class Solution {
    public int smallestNumber(int n, int t) {
        int num = n;
        int ans = 1;
        boolean check = true;
        while(check){
            int temp = num;
            int product = 1;
            while(temp!=0){
                int ld = temp%10;
                temp/=10;
                product*=ld;
            }
            if(product%t==0){
                ans=num;
                check = false;
                break;
            }
            num++;
        }
        return ans;
    }
}