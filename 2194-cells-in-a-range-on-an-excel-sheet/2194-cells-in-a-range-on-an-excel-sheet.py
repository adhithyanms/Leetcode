class Solution:
    def cellsInRange(self, s: str) -> List[str]:
        return [chr(i)+chr(j) for i in range(ord(s[0]),ord(s[3])+1) for j in range(ord(s[1]),ord(s[4])+1)]