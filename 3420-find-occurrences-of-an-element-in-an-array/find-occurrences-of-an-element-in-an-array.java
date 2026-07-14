class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                arr.add(i);
            }
        }
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if(queries[i]>arr.size()){
                ans[i] = -1;
            }
            else{
                ans[i] = arr.get(queries[i]-1);
            }
        }
        return ans;
    }
}