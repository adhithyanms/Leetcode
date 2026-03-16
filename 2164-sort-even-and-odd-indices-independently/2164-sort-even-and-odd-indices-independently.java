class Solution {
    public int[] sortEvenOdd(int[] nums) {
        
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
                odd.add(nums[i]);
            }else{
                even.add(nums[i]);
            }
        }
        
        Collections.sort(even);
        odd.sort((a,b)->b-a);
        int oddIndex = 0 , evenIndex = 0;
        for(int i = 0 ; i<nums.length;i++){
            if(i%2==0){
            nums[i]=even.get(evenIndex++);}
            else{nums[i]=odd.get(oddIndex++);}
    
        }
        return nums;
    }
}