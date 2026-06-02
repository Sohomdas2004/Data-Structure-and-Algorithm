#User function Template for python3

class Solution:
    def replaceWithRank(self, N, arr):
        # Code here
        arr1=[]
        res=[]
        map={}
        
        for num in arr:
            arr1.append(num)
            
        rank=1
        arr1.sort()
        
        for num in arr1:
            if num not in map:
                map[num]=rank
                rank+=1
            
        for num in arr:
            res.append(map[num])
            
        return res