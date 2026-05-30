class Solution:
    def getSecondLargest(self, arr):
        # Code Here
        max1=arr[0]
        max2=-1
        
        for num in arr:
            if(num>max1):
                max2=max1
                max1=num
            elif(num>max2 and num<max1):
                max2=num
                
        return max2