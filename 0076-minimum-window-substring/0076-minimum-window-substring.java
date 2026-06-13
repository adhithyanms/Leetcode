class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        String ans = "";
        int[] Freq = new int[128];
        for (char c : t.toCharArray()) {
            Freq[c]++;
        }
        char[] c = s.toCharArray();
        int count = t.length();
        for (int right = 0; right < s.length(); right++) {
            if (Freq[c[right]] > 0) {
                count--;
            }
            Freq[c[right]]--;
            while (count == 0) {
                if (right - left + 1 < minLength) {
                    ans = s.substring(left, right+1);
                    minLength = right - left + 1;
                }
                Freq[c[left]]++;
                if(Freq[c[left]]>0){
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}