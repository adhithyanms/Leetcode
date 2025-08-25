class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row,col,ans,left,right,direction=len(mat),len(mat[0]),[],0,0,False
        iteration=row*col
        
        while iteration>0:
            flag=0
            if (left>=0 and left<row and right>=0 and right<col):
                ans.append(mat[left][right])
                iteration-=1
            else:
                if left<0:
                    left+=1
                    direction=True
                if right<0:
                    right+=1
                    direction=False
                if left>row:
                    left-=1
                if right>col:
                    right-=1
                flag=1
            if flag==0:
                if direction:
                    left+=1
                    right-=1
                else:
                    left-=1
                    right+=1
            if left>=row:
                left=row-1
                right+=2
                direction=False
            if right>=col:
                right=col-1
                left+=2
                direction=True
        return ans
            
        