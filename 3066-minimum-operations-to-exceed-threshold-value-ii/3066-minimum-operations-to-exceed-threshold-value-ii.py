import heapq
class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        count=0
        heapq.heapify(nums)
        while len(nums)>1 and nums[0]<k:
            count+=1
            cal=heapq.heappop(nums)*2+heapq.heappop(nums)
            heapq.heappush(nums,cal)
            # heapq.heapify(nums)
        return count
        