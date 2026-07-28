int maxProduct(int* nums, int numsSize) 
{
    int max=0,count=0;
    for(int i=0;i<numsSize-1;i++)
     {  count=0;
        for(int j=i+1;j<numsSize;j++)
        {
           count=(nums[i]-1)*(nums[j]-1);
           if(count>max)
           {
            max=count;
           }
        }
     }
     return max;
}