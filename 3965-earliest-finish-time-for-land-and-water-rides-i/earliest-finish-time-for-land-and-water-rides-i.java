class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterDuration.length;j++){
                int t = landStartTime[i]+landDuration[i];
                if(waterStartTime[j]<=t){
                    t += waterDuration[j];
                }
                else{
                    int addition = waterStartTime[j] - t + waterDuration[j];
                    t += addition;
                }
                min = Math.min(min, t);
            }
        }
        for(int i=0;i<waterStartTime.length;i++){
            for(int j=0;j<landStartTime.length;j++){
                int t = waterStartTime[i] + waterDuration[i];
                if(landStartTime[j]<=t){
                    t += landDuration[j];
                }
                else{
                    int addition = landStartTime[j] - t + landDuration[j];
                    t += addition;
                }
                min = Math.min(min,t);
            }
        }
        return min;
    }
}