class Solution {
    public int minimumOperations(int[] nums) {
       PriorityQueue<Integer> PQ=new PriorityQueue<>();
       for(int n:nums)
       {
        if(n!=0)PQ.add(n);
       } 
       int count=0;
       while(!PQ.isEmpty())
       {   count++;
           int min=PQ.poll();
           List<Integer> temList=new ArrayList<>();
           while(!PQ.isEmpty())
           {
            int val=PQ.poll()-min;
            if(val>0)temList.add(val);
           }
           PQ.addAll(temList);
       }
       return count;
    }
}