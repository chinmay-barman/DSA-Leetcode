class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==1){
            return cost[0];
        }
        Arrays.sort(cost);
        int pointer = cost.length-1;
        int sum = 0;
        while(pointer>=0){
            for(int i=0;i<2;i++){
                sum+=cost[pointer];
                pointer--;
                if(pointer<0){
                    break;
                }
            }
            pointer--;
        }
        return sum;
    }
}