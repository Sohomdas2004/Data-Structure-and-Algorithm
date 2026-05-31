class Solution:
    def findMedian(self, arr):
        #code here.
        arr.sort()
        if len(arr)%2==0:
            return (arr[len(arr)//2]+arr[(len(arr)-2)//2])/2.0
        else:
            return arr[len(arr)//2]