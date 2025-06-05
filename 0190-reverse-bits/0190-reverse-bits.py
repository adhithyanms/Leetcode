class Solution:
    def reverseBits(self, n: int) -> int:
        change=format(n,'032b')
        change=change[::-1]
        return int(change,2)

        