class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int maxFreq = 0;
        for(char ch : s.toCharArray()) {
            int freq = map.getOrDefault(ch, 0) + 1;
            map.put(ch, freq);
            maxFreq = Math.max(maxFreq, freq);
        }

        ArrayList<ArrayList<Character>> matrix = new ArrayList<>();

        for(int i = 0; i <= maxFreq; i++) {
            matrix.add(new ArrayList<>());
        }

        for(char ch : map.keySet()) {
            matrix.get(map.get(ch)).add(ch);
        }

        StringBuilder ans = new StringBuilder();

        for(int freq = maxFreq; freq >= 1; freq--) {
            for(char ch : matrix.get(freq)) {
                for(int k = 0; k < freq; k++) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}