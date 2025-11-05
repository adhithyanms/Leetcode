class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> ans=new ArrayList<>();
        int minIndex=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            String val1=list1[i];
            int index=Arrays.asList(list2).indexOf(val1);
            if(index!=-1){
               if(i+index<minIndex){
                ans.clear();
                ans.add(val1);
                minIndex=i+index;
               }
               else if(i+index==minIndex){
                ans.add(val1);
               }
            }
        }
        return ans.toArray(new String[0]);
    }
}