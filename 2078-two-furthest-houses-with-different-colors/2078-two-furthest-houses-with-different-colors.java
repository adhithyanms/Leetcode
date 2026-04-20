class Solution {
    public int maxDistance(int[] colors) {
        int maxLength = Integer.MIN_VALUE;
        for(int i = 0;i<colors.length;i++){
            for(int j =0;j<colors.length;j++){
                if(colors[i]!=colors[j] && i!=j){
                    maxLength = Math.max(maxLength,Math.abs(i-j));
                }
            }
        }
        return maxLength;
    }
}