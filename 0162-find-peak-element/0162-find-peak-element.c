int findPeakElement(int* nums, int numsSize)
 {    
    int tem=INT_MIN,n=0;
    for(int i=0;i<numsSize;i++)
    {    
        if(nums[i]>tem)
        {
            tem=nums[i];
            n=i;
        }
    }
    return n;
}