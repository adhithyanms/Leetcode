class Solution:
    def mergeSimilarItems(self, items1: List[List[int]], items2: List[List[int]]) -> List[List[int]]:
       merged={}
       for value,weight in items1+items2:
        merged[value]=merged.get(value,0)+weight
       return sorted(merged.items())
        