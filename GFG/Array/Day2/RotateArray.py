class Solution:
    def rotateArr(self, arr, d):
        #code here
        res=[0]*len(arr)
        
        for i in range(len(arr)):
            res[i]=arr[(i+d)%len(arr)]
            
        for i in range(len(arr)):
            arr[i]=res[i]