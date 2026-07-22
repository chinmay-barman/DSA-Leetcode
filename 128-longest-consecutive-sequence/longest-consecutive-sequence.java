class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num: set){
            if(!set.contains(num-1)){
                int count = 1;
                int current = num;
                while(set.contains(current+1)){
                    count++;
                    current = current+1;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}