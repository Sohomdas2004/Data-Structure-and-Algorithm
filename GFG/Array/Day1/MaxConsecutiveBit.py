class Solution:
    def maxConsecBits(self, arr):
        #code here 
        if(len(arr)==1):
            return 1
        
        count=1
        res=1
        
        for i in range(len(arr)-1):
            if(arr[i+1]==arr[i]):
                count+=1
                res=max(count,res)
            else:
                count=1
                
        
        return res