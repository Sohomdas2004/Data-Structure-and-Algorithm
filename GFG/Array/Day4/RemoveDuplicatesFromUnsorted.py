class Solution:
    def removeDuplicate(self, arr):
        # code here
        seen=set()
        res=[]
        
        for num in arr:
            if num not in seen:
                seen.add(num)
                res.append(num)
                
        return res