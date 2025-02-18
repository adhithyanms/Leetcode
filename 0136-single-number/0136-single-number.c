int singleNumber(int* nums, int numsSize) {
     for(int i=0;i<numsSize;i++)
     {  int check=1;
        for(int j=0;j<numsSize;j++)
        {
            if(i!=j && nums[i]==nums[j])
            {
               check=0;
            }
        }
        if(check)
        {
            return nums[i];
        }
     }
     return -1;
}