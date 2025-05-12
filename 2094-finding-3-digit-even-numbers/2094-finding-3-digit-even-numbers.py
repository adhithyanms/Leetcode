from typing import List
from itertools import permutations

class Solution:
    def findEvenNumbers(self, digits: List[int]) -> List[int]:
        ans = set()
        for p in permutations(digits, 3):
            num = p[0]*100 + p[1]*10 + p[2]
            if num % 2 == 0 and num >= 100:
                ans.add(num)
        return sorted(ans)
