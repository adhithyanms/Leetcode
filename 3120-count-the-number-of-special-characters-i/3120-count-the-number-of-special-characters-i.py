class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
      l=[]
      count=0
      upper='ABCDEFGHIJKLMNOPQRSTUVWXYZ'
      lower='abcdefghijklmnopqrstuvwxyz'
      word=set(list(word))
      for i in word:
        if i in lower and i.upper() in l:
            count+=1
        if i in upper and i.lower() in l:
            count+=1
        else:
            l.append(i)
      return count
       

        