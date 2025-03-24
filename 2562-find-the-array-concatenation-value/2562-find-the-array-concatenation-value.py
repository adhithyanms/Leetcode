class Solution:
    def findTheArrayConcVal(self, nums: List[int]) -> int:
        left,right=0,len(nums)-1
        tem=[]
        while left<=right:
            if left!=right:
                tem.append(int(str(nums[left])+str(nums[right])))
            elif left==right:
                tem.append(nums[left])
            left+=1
            right-=1
        return sum(tem)
        

        