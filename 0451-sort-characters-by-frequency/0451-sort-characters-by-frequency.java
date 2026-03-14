class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> countChar = new ArrayList<>(map.keySet());
        Collections.sort(countChar , (a,b)->map.get(b)-map.get(a));
        StringBuilder ans = new StringBuilder();
        for(char c : countChar){
            ans.append(String.valueOf(c).repeat(map.get(c)));
        }
        return ans.toString();
    }
    }