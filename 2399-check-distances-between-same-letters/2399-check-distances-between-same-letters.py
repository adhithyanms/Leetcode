class Solution:
    def checkDistances(self, s: str, distance: List[int]) -> bool:
        final={}
        for i,char in enumerate(s):
            curr_index=ord(char)-ord('a')
            if char in final:
                current_distance=i-final[char]-1
                if current_distance!=distance[curr_index]:
                    return False
            else:
                final[char]=i
        return True
            

        

        