class Solution {
    public int gcd(int a, int b){
        int x = a;
        int y = b;
        while(y!=0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }
    public long gcdSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prefixGcd[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            prefixGcd[i] = gcd(max,nums[i]);
        }
        long ans = 0;
        Arrays.sort(prefixGcd);
        int left = 0;
        int right = prefixGcd.length-1;
        while(left<right){
            ans += (long)gcd(prefixGcd[left],prefixGcd[right]);
            left++;
            right--;
        }
        return ans;
    }
}