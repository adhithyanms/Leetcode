class Solution:
    def deleteGreatestValue(self, grid: List[List[int]]) -> int:
        for i in range(len(grid)):
            grid[i].sort(reverse=True)
        sums=0
        for i in range(len(grid[0])):
            maxVal=0
            for j in range(len(grid)):
                maxVal=max(grid[j][i],maxVal)
            sums+=maxVal
        return sums
        