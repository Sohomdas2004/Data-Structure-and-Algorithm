class Solution:
    def rowWithMax1s(self, arr):
        # code here
        res=-1
        maxx=0
        
        for i in range(len(arr)):
            count=0
            for j in arr[i]:
                if j==1:
                    count+=1
                if maxx<count:
                    res=i
                    maxx=count
                
        return res