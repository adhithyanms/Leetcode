class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int uniqueCount = 1; 
        for (int i = 1; i < candyType.length; i++) {
            if (candyType[i] != candyType[i - 1]) {
                uniqueCount++;
            }
        }
        int maxCanEat = candyType.length / 2;
        return Math.min(uniqueCount, maxCanEat);
    }
}
