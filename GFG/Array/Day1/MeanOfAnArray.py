class Solution:
    def findMean(self, arr):
        # code here 
        summ=0
        for num in arr:
            summ+=num
        
        return int(summ/len(arr))