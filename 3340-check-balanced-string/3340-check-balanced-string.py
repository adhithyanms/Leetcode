class Solution(object):
    def isBalanced(self, num):
        """
        :type num: str
        :rtype: bool
        """
        return sum([int(num[i]) for i in range(len(num)) if i%2!=0])==sum([int(num[i]) for i in range(len(num)) if i%2==0])
        