class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        count={}
        for i in range(len(mat)):
            count[i]=mat[i].count(1)
        sort_count=dict(sorted(count.items() ,key=lambda item:item[1]))
        ans=list(sort_count.keys())
        return ans[:k]
                     