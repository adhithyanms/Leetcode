class Solution:
    def countAsterisks(self, s: str) -> int:
        count=0
        status=True
        for ch in s:
            if status and ch=='*':
                count+=1
            if ch=='|':
                status=not status
        return count

        