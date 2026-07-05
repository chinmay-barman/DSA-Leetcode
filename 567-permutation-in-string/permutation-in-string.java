class Solution {
    public boolean check(HashMap<Character,Integer>mapMain,HashMap<Character,Integer>map){
        for(Character key: mapMain.keySet()){
            if(map.containsKey(key)){
                if(!map.get(key).equals(mapMain.get(key))){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> mapMain = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(mapMain.containsKey(s1.charAt(i))){
                int count = mapMain.get(s1.charAt(i));
                mapMain.put(s1.charAt(i),++count);
            }
            else{
                mapMain.put(s1.charAt(i),1);
            }
        }
        int left = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right=0;right<s2.length();right++){
            if(map.containsKey(s2.charAt(right))){
                int count = map.get(s2.charAt(right));
                map.put(s2.charAt(right),++count);
            }
            else{
                map.put(s2.charAt(right),1);
            }
            if(right-left+1==s1.length()){
                if(check(mapMain,map)){
                    return true;
                }
                if(map.get(s2.charAt(left))==1){
                    map.remove(s2.charAt(left));
                }
                else{
                    int count = map.get(s2.charAt(left));
                    map.put(s2.charAt(left),--count);
                }
                left++;
            }
            
        }
        return false;
    }
}