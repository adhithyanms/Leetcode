int removeElement(int* nums, int numsSize, int val) {
   int count=0;
    for (int check = 0; check < numsSize; check++) {
       
          if(nums[check]!=val)
          {
            nums[count]=nums[check];
            count++;
          }
      }
    return count;
}