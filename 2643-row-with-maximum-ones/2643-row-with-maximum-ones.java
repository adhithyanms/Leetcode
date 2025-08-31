class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res={0,0};
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                    count+=mat[i][j];
            }
            if(res[1]<count){
                res[0]=i;
                res[1]=count;
            }
        }
        return res;
    }
}