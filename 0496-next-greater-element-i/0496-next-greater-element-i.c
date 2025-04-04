/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextGreaterElement(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    int *ans=(int*)malloc(sizeof(int)*nums1Size);
    *returnSize=nums1Size;
    int start,greater,index=0;
    for(int i=0;i<nums1Size;i++)
    {   greater=-1;
        start=-1;
        for(int k=0;k<nums2Size;k++)
        {
            if(nums2[k]==nums1[i])
            {
                start=k;
                break;
            }
        }
        for(int j=start+1;j<nums2Size;j++)
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