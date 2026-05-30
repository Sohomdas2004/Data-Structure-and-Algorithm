class Solution:
    def removeDuplicates(self, arr):
        # code here 
        res=[]
        
        for num in arr:
            if num not in res:
                res.append(num)
                
        return res