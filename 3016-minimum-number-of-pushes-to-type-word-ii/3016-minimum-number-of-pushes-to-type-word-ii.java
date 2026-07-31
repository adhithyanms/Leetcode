class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        int pushCount = 0, currentId = 0;
        Arrays.sort(freq);
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) {
                break;
            }
            int currentPress = currentId / 8 + 1;
            pushCount += currentPress * freq[i];
            currentId++;

        }
        return pushCount;
    }
}