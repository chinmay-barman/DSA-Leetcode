class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[0]!=1){
                    for(int j=1;j<nums[i];j++){
                        arr.add(j);
                    }
                }
            }
            else if(i==nums.length-1){
                if(nums[nums.length-1]!=nums.length){
                    for(int j=nums[nums.length-1]+1;j<=nums.length;j++){
                        arr.add(j);
                    }
                }
                else{
                    if(nums[i]>nums[i-1]+1){
                        for(int j=nums[i-1]+1;j<nums[i];j++){
                            arr.add(j);
                        }
                    }
                }
            }
            else{
                if(nums[i]>nums[i-1]+1){
                    for(int j=nums[i-1]+1;j<nums[i];j++){
                        arr.add(j);
                    }
                }
            }
        }
        return arr;
    }
}