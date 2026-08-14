class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(left!=s.length() && right!=s.length()){
            if(map.containsKey(s.charAt(right))){
                int count = map.get(s.charAt(right));
                map.put(s.charAt(right),++count);
            }
            else{
                map.put(s.charAt(right),1);
            }
            while(map.get(s.charAt(right))>2){
                int c = map.get(s.charAt(left));
                if(c==1){
                    map.remove(s.charAt(left));
                }
                else{
                    map.put(s.charAt(left),--c);
                }
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}