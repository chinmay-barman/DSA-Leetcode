class Solution {
    public int maxDigitRange(int[] nums) {
        int max = 0;
        int sum = 0;
        int range[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            int dmax = 0;
            int dmin = 10;
            while(temp!=0){
                int lastd = temp%10;
                dmax = Math.max(dmax,lastd);
                dmin = Math.min(dmin,lastd);
                temp/=10;
            }
            range[i] = dmax-dmin;
            max = Math.max(max,(dmax-dmin));
        }
        for(int i=0;i<range.length;i++){
            if(range[i]==max){
                sum+=nums[i];
            }
        }
        return sum;
    }
}