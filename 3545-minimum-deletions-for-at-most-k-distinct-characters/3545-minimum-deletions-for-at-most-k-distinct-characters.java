class Solution {
    public int minDeletion(String s, int k) {
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()) {
            set.add(c);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        if (set.size() == k) {
            return 0;
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> a.getValue().compareTo(b.getValue()));
        int ans = 0;
        int remove = map.size() - k;
        for (int i = 0; i < remove; i++) {
            ans += list.get(i).getValue();
        }
        return ans;
    }
}