class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num: set){
            if(!set.contains(num-1)){
                int streak = 1;
                int currentnum = num;
                while(set.contains(currentnum+1)){
                    currentnum = currentnum+1;
                    streak++;
                }
                max = Math.max(max,streak);
            }
        }
        return max;
    }
}