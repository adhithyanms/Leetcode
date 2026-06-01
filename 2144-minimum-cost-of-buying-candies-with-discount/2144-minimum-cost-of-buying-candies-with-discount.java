class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int minimumCost = 0;
        for(int i = cost.length-1;i>=0;i-=3){
            minimumCost +=cost[i];
            if(i-1>=0){
                minimumCost+=cost[i-1];
            }
        }
        return minimumCost;
    }
}