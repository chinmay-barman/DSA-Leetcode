class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans[] = new int[set.size()];
        int index=0;
        for(int value: set){
            ans[index] = value;
            index++;
        }
        Arrays.sort(ans);
        for(int i=0;i<ans.length;i++){
            nums[i] = ans[i];
        }
        return set.size();
    }
}