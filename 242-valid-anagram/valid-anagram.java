class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> maps = new HashMap<>();
        HashMap<Character,Integer> mapt = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(maps.containsKey(s.charAt(i))){
                int count = maps.get(s.charAt(i));
                maps.put(s.charAt(i),++count);
            }
            else{
                maps.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(mapt.containsKey(t.charAt(i))){
                int count = mapt.get(t.charAt(i));
                mapt.put(t.charAt(i),++count);
            }
            else{
                mapt.put(t.charAt(i),1);
            }
        }
        for(Character key: maps.keySet()){
            if(mapt.containsKey(key)){
                if(!maps.get(key).equals(mapt.get(key))){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}