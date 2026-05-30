class Solution:
    def largest(self, arr):
        # code here
        res=0
        for num in arr:
            if num>res:
                res=num
                
        return res