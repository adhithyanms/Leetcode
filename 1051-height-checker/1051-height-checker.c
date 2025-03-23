int heightChecker(int* heights, int heightsSize) 
{ int *arr=malloc(sizeof(int)*heightsSize);
    int count=0,tem=0;
    for(int i=0;i<heightsSize;i++)
    {
        arr[i]=heights[i];
    }
    for(int i=0;i<heightsSize;i++)
    {
       for(int  j=0;j<heightsSize;j++)
       {
         if(heights[i]<heights[j])
         {
         tem=heights[j];
         heights[j]=heights[i];
         heights[i]=tem;
         }
       }
    }
    for(int  i=0;i<heightsSize;i++)
    { 
       if(arr[i]!=heights[i])
       {
        count++;
       }
    }
    return count;
}