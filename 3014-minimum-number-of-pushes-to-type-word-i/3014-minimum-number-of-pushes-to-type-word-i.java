class Solution {
    public int minimumPushes(String word) {
        int pushCount = 0;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            pushCount += i / 8 + 1;
        }
        return pushCount;
    }
}