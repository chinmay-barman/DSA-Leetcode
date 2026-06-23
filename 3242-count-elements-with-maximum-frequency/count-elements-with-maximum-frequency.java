class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i],++count);
            }
            else{
                map.put(nums[i],1);
            }
            max = Math.max(max,map.get(nums[i]));
        }
        int count = 0;
        for(Integer value: map.values()){
            if(value==max){
                count++;
            }
        }
        return count*max;
    }
}