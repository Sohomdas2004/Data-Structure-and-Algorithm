class Solution:
    def maxSubarraySum(self, arr):
        # Code here
        cursum=0
        maxsum=arr[0]
        
        for num in arr:
            if(cursum<0):
                cursum=0
            cursum+=num
            maxsum=max(cursum,maxsum)
            
        return maxsum