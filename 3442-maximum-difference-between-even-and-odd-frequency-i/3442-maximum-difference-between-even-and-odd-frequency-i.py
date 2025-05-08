class Solution:
    def maxDifference(self, s: str) -> int:
        counts=Counter(s)
        evenmax,oddmax=[],[]
        for count in counts.values():
            if  count%2==0:
                evenmax.append(count)
            else:
                oddmax.append(count)
        return max(oddmax)-min(evenmax)

        