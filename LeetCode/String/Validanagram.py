#LeetCode 242. Valid Anagram

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(t)!=len(s)):
            return False

        s_list=list(s)
        l_list=list(t)
        s_list.sort()
        l_list.sort()

        for i in range(len(s_list)):
            if(s_list[i]!=l_list[i]):
                return False
        
        return True