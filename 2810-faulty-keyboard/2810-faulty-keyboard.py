class Solution:
    def finalString(self, s: str) -> str:
        rev=''
        for i in s:
            if i!='i':
                rev+=i
            else:
                rev=rev[::-1]
        return rev
        