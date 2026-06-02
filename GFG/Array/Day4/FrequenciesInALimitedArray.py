class Solution:
    def frequencyCount(self, arr):
        #  code here
        map={}
        res=[]
        
        for num in arr:
            if num in map:
                map[num]=map[num]+1
            else:
                map[num]=1
                
        for i in range(1,len(arr)+1):
            if i in map:
                res.append(map[i])
            else:
                res.append(0)
                
        return res