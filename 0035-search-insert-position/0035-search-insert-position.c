int searchInsert(int* nums, int numsSize, int target) {
    if(nums[0]>=target)
    {
        return 0;
    }
   
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]==target)
        {
            return i;
        }
    }
    for(int i=0;i<numsSize-1;i++)
    {
        if(nums[i]<target && nums[i+1]>target)
        {
            return i+1;
        }
    }

    return numsSize;
}