
int* pivotArray(int* nums, int numsSize, int pivot, int* returnSize) 
{
    int *arr=malloc(sizeof(int)*numsSize);
    int index=0;
    *returnSize=numsSize;
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]<pivot)
        {
            arr[index++]=nums[i];
        }
    }
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]==pivot)
        {
            arr[index++]=nums[i];
        }
    }
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]>pivot)
        {
            arr[index++]=nums[i];
        }
    }
    return  arr;
}