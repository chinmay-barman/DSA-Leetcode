class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int nums[],int left, int right){
        if(left==right){
            return;
        }
        int mid = left+(right-left)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }
    public void merge(int nums[],int left,int mid,int right){
        ArrayList<Integer> arr = new ArrayList<>();
        int i=left;
        int j=mid+1;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                arr.add(nums[i]);
                i++;
            }
            else{
                arr.add(nums[j]);
                j++;
            }
        }
        while(i<=mid){
            arr.add(nums[i]);
            i++;
        }
        while(j<=right){
            arr.add(nums[j]);
            j++;
        }
        for(int k=0;k<arr.size();k++){
            nums[k+left] = arr.get(k);
        }
    }
}