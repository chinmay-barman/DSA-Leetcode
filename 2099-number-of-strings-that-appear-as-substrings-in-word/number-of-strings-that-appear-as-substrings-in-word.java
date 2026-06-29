class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i=0;i<patterns.length;i++){
            int left = 0;
            if(patterns[i].length()>word.length()){
                continue;
            }
            while(left+patterns[i].length()<=word.length()){
                String substr = word.substring(left,left+patterns[i].length());
                if(substr.equals(patterns[i])){
                    count++;
                    break;
                }
                left++;
            }
        }
        return count;
    }
}