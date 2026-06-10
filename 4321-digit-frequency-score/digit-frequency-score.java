class Solution {
    public int digitFrequencyScore(int n) {
        int temp =n;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(temp!=0){
            int last = temp%10;
            temp /=10;
            if(map.containsKey(last)){
                int count = map.get(last);
                map.put(last,++count);
            }
            else{
                map.put(last,1);
            }
        }
        int ans = 0;
        for(Integer key: map.keySet()){
            ans+= (key*map.get(key));
        }
        return ans;
    }
}