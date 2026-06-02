class Solution:
    def firstNonRepeating(self, arr): 
        # code here
        map={}
        
        for num in arr:
            if num in map:
                map[num]=map[num]+1
            else:
                map[num]=1
                
        for num in arr:
            if(map[num]==1):
                return num
            
        return 0