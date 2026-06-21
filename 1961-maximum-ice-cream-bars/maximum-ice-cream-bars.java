class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int temp = coins;
        int count = 0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=temp){
                count++;
                temp = temp-costs[i];
            }
            else{
                break;
            }
        }
        return count;
    }
}