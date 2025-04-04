class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []ans=new int[nums1.length];
        int greater,index=0,start;
        for(int i=0;i<nums1.length;i++)
        {
            greater=-1;
            start=-1;
            for(int k=0;k<nums2.length;k++)
            {
                if(nums2[k]==nums1[i])
                {
                    start=k;
                    break;
                }
            }
            for(int j=start+1;j<nums2.length;j++)
            {
                if(nums2[j]>nums1[i])
                {
                    greater=nums2[j];
                    break;
                }
            }
            ans[index++]=greater;
        }
        return ans;
    }
}