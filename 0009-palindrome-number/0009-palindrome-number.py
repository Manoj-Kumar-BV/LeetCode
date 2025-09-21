class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        original = x
        rev = 0
        while(x > 0):
            last = x%10
            rev = rev * 10 + last
            x = x//10
        
        return rev == original
