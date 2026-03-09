class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(String s : strs){
            char []c = s.toCharArray();
            Arrays.sort(c);
            String newString  = new String(c);
            if(!map.containsKey(newString)){
                map.put(newString , new ArrayList<>());
                }
                map.get(newString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}