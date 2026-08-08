class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        while (k > 0) {
            // Which word currently has the highest frequency?
            String maxWord = "";
            // What is that frequency?
            int maxFreq = 0;
            for (Map.Entry<String, Integer> str : map.entrySet()) {
                //If both have the same frequency, choose the alphabetically smaller word.
                if (str.getValue() > maxFreq ||(str.getValue() == maxFreq && str.getKey().compareTo(maxWord) < 0)) {
                    // negative → first string comes BEFORE second
                    //0 → both strings are equal
                    //positive → first string comes AFTER second
                    maxFreq = str.getValue();
                    maxWord = str.getKey();
                }
            }
            ans.add(maxWord);
            map.remove(maxWord);
            k--;
        }
        return ans;
    }
}