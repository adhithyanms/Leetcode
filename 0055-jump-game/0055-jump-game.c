bool canJump(int* nums, int numsSize) {
   int len=numsSize-1;
   for(int i=numsSize-1;i>=0;i--)
   {
    if(len<=nums[i]+i)
    {
        len=i;
    }
   }
   return len==0;
}