class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sort = new String(chars);
            if(!map.containsKey(sort)) {
                map.put(sort,new ArrayList<>());
            }
            map.get(sort).add(word);
        }
        return new ArrayList<>(map.values());
    }
}