void findZero(int row,int col,int **matrix,int rowsize,int *colsize)
{
   for(int i=0;i<*colsize;i++)
   {
    if(matrix[row][i]!=0){
        matrix[row][i]=9939;
    }
   }
     for(int j=0;j<rowsize;j++)
   {
    if(matrix[j][col]!=0){
        matrix[j][col]=9939;
    }
   }
   matrix[row][col]=9939;
   }
void setZeroes(int** matrix, int matrixSize, int* matrixColSize) {
  for(int i=0;i<matrixSize;i++)
  {
    for(int j=0;j<*matrixColSize;j++)
    {
        if(matrix[i][j]==0)
        {
            findZero(i,j,matrix,matrixSize,matrixColSize);
        }
    }
  }  
    for(int i=0;i<matrixSize;i++)
  {
    for(int j=0;j<*matrixColSize;j++)
    {
        if(matrix[i][j]==9939)
        {
           matrix[i][j]=0;
        }
    }
  }  
    
}