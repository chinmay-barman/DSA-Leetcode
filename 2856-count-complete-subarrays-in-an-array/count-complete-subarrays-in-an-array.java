class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> whole = new HashSet<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            whole.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> sub = new HashSet<>();
            for(int j=i;j<nums.length;j++){
                sub.add(nums[j]);
                if(sub.size()==whole.size()){
                    count++;
                }
            }
        }
        return count;
    }
}