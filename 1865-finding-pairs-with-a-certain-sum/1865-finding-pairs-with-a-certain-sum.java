class FindSumPairs {
  private int []nums1;
  private int []nums2;

    public FindSumPairs(int[] nums1, int[] nums2) {
      this.nums1=nums1;
      this.nums2=nums2;
    }
    
    public void add(int index, int val) {
        if(nums2.length<=index || index<0) return;
        nums2[index]=nums2[index]+val; 
    }
    
    public int count(int tot) {
        int count=0;
        for(int n1:nums1)
        {
            for(int n2:nums2)
            {
                if(n1+n2==tot)
                {
                    count++;
                }
            }
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */