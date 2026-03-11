class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String , Integer> map = new HashMap<>();
        for(String w  : words){
            map.put(w , map.getOrDefault(w,0)+1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            int fa = map.get(a);
            int fb = map.get(b);
            if(fa == fb){
                return a.compareTo(b);
            }
            return fb-fa;
            
        });
        return list.subList(0,k);
    }
}