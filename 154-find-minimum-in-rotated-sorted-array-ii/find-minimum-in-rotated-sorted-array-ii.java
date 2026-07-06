class Solution {
    public void reverse(int[] arr, int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public int findMin(int[] nums) {
        int point = 0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                return nums[0];
            }
            if(nums[i]>nums[i+1]){
                point = i;
                break;
            }
        }
        reverse(nums,0,point);
        reverse(nums,point+1,nums.length-1);
        reverse(nums,0,nums.length-1);
        return nums[0];
    }
}