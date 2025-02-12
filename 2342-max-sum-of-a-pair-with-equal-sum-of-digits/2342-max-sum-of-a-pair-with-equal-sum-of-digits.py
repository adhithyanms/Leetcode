from typing import List

class Solution:
    def maximumSum(self, nums: List[int]) -> int:
        digit_sum_map = {} 
        max_sum = -1  
        for num in nums:
            digit_sum = sum(int(d) for d in str(num))  
            if digit_sum in digit_sum_map:
                max_sum = max(max_sum, num + digit_sum_map[digit_sum])
                digit_sum_map[digit_sum] = max(num, digit_sum_map[digit_sum])
            else:
                digit_sum_map[digit_sum] = num
        return max_sum
