class Solution {
    public boolean check(HashMap<Character,Integer> mapp,HashMap<Character,Integer> maps){
        for(Character key: mapp.keySet()){
            if(maps.containsKey(key)){
                if(!mapp.get(key).equals(maps.get(key))){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> mapp = new HashMap<>();
        HashMap<Character,Integer> maps = new HashMap<>();
        for(int i=0;i<p.length();i++){
            if(mapp.containsKey(p.charAt(i))){
                int count = mapp.get(p.charAt(i));
                mapp.put(p.charAt(i),++count);
            }
            else{
                mapp.put(p.charAt(i),1);
            }
        }
        int left = 0;
        for(int right=0;right<s.length();right++){
            if(maps.containsKey(s.charAt(right))){
                int count = maps.get(s.charAt(right));
                maps.put(s.charAt(right),++count);
            }
            else{
                maps.put(s.charAt(right),1);
            }
            if(right-left+1==p.length()){
                if(check(mapp,maps)){
                    ans.add(left);
                }
                if(maps.get(s.charAt(left))==1){
                    maps.remove(s.charAt(left));
                }
                else{
                    int count = maps.get(s.charAt(left));
                    maps.put(s.charAt(left),--count);
                }
                left++;
            }
        }
        return ans;
    }
}