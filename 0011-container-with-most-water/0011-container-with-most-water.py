class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area,left,right=0,0,len(height)-1
        while left<right:
            current_max=min(height[left],height[right])*(right-left)
            max_area=max(current_max,max_area)
            if height[left]<height[right]:
                left+=1
            else:
                right-=1
        return max_area

        