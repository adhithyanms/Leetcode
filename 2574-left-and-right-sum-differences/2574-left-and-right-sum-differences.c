int* leftRightDifference(int* nums, int numsSize, int* returnSize)
{
    int r=numsSize-1;
    int ls=0,rs=0,l,k,left[numsSize],right[numsSize];
    for(int i=0;i<numsSize;i++)
    {
        l=nums[i];
        left[i]=ls;
        ls+=l;
        k=nums[r];
        right[r]=rs;
        rs+=k;
        r--;
    }
    for(int i=0;i<numsSize;i++)
    {
        nums[i]=abs(right[i]-left[i]);
    }
    *returnSize=numsSize;
    return nums;
}