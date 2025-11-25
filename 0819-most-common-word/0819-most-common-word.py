class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        ans=re.split(r'\W+',paragraph.lower())
        check=[i for i in ans if i not in banned and i!='']
        return max(check,key=check.count)           
                
