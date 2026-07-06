class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[] = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int index = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                merged[index] = nums1[i];
                i++;
            }
            else{
                merged[index] = nums2[j];
                j++;
            }
            index++;
        }
        while(i<nums1.length){
            merged[index] = nums1[i];
            i++;
            index++;
        }
        while(j<nums2.length){
            merged[index] = nums2[j];
            j++;
            index++;
        }
        int mid =-1;
        mid = merged.length/2;
        if(merged.length%2==0){
            double median = (double)(merged[mid-1]+merged[mid]);
            median = median/(double)2;
            return median;
        }
        return merged[mid];
    }
}