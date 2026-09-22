class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] words=str.toCharArray();
            Arrays.sort(words);
            String word=new String(words);
            if(!map.containsKey(word)){
                map.put(word,new ArrayList<>());
            }
            map.get(word).add(str);
        }
        return new ArrayList<>(map.values());
    }
}