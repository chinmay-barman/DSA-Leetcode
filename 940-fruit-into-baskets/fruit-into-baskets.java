class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int left = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right=0;right<fruits.length;right++){
            if(map.containsKey(fruits[right])){
                int count = map.get(fruits[right]);
                map.put(fruits[right],++count);
            }
            else{
                map.put(fruits[right],1);
            }
            while(map.size()>2){
                int count = map.get(fruits[left]);
                if(count==1){
                    map.remove(fruits[left]);
                }
                else{
                    map.put(fruits[left],--count);
                }
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}