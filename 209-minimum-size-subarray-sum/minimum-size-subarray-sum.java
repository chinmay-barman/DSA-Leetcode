class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = nums.length+1;
        int sum = 0;
        int left = 0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                min = Math.min(min,right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        if(min>nums.length){
            return 0;
        }
        return min;
    }
}