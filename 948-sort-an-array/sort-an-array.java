class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int nums[],int low, int high){
        if(low>=high){
            return;
        }
        int mid = low+(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public void merge(int nums[],int low, int mid, int high){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = low;
        int j = mid+1;
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                ans.add(nums[i]);
                i++;
            }
            else{
                ans.add(nums[j]);
                j++;
            }
        }
        while(i<=mid){
            ans.add(nums[i]);
            i++;
        }
        while(j<=high){
            ans.add(nums[j]);
            j++;
        }
        for(int k=0;k<(high-low+1);k++){
            nums[low+k] = ans.get(k);
        }
    }
}