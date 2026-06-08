class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr1.add(nums[i]);
            }
            else if(nums[i]>pivot){
                arr2.add(nums[i]);
            }
        }
        for(int i=0;i<arr1.size();i++){
            nums[i] = arr1.get(i);
        }
        for(int i=arr1.size();i<nums.length-arr2.size();i++){
            nums[i] = pivot;
        }
        for(int i=nums.length-arr2.size();i<nums.length;i++){
            nums[i] = arr2.get(i-nums.length+arr2.size());
        }
        return nums;
    }
}