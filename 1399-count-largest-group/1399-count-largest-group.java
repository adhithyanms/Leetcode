class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0,max=0;
        for(int i=1;i<=n;i++){
            int x=digitSum(i);
            map.put(x,map.getOrDefault(x,0)+1);
            max=Math.max(max,map.get(x));
        }
        for(int val:map.values())if(val==max)count++;
        return count;
    }
        int digitSum(int n){
        return n==0?0:(n%10)+digitSum(n/10);
        }
}