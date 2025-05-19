class Solution:
    def triangleType(self, nums: List[int]) -> str:
        x,y,z=nums
        if x+y<=z or y+z<=x or x+z<=y:
            return "none"
        if x==y==z:
            return "equilateral"
        elif x==y or y==z or x==z:
            return "isosceles"
        else:
            return "scalene"
        