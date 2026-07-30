class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int first = nums[0]*nums[1]*nums[2];
        int last = nums[n-1]*nums[n-2]*nums[n-3];
        int mid = nums[0]*nums[1]*nums[n-1];
        int max = Math.max(first,mid);
        max = Math.max(mid,last);
        return max;
    }
}