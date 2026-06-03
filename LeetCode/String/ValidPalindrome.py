#LeetCode 125. Valid Palindrome

class Solution:
    def isPalindrome(self, s: str) -> bool:
        string=""
        for i in s:
            if i==" ":
                continue
            string=string+i

        return string==string[::-1]