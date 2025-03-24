int removeDuplicates(int* nums, int numsSize) {
int count=0;
for(int i=0;i<numsSize;i++)
{
    if(count==0 || count==1 || nums[count-2]!=nums[i])
    {
        nums[count]=nums[i];
        count++;
    }
}
return count;
}