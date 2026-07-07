class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int newN = 0;
        int temp = n;
        int dplace = 0;
        while(temp!=0){
            int lastd = temp%10;
            if(lastd!=0){
                newN+=(lastd*(Math.pow(10,dplace)));
                dplace++;
                sum+=lastd;
            }
            temp/=10;
        }
        return (long)newN*(long)sum;
    }
}