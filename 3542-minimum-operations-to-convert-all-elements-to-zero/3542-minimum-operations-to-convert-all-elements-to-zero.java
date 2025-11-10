class Solution {
    public int minOperations(int[] nums) {
        int operation = 0;
        int prev = 0; 
        for (int n : nums) {
            if (n > prev) {
                operation++;
                prev = n; 
            } 
            else if (n < prev) {
                prev = n; 
            }
        }

        return operation;
    }
}
