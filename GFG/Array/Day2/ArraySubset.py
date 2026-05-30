#User function Template for python3

class Solution:
    #Function to check if a is a subset of b.
    def isSubset(self, a, b):
        #Your code here
        i=0
        j=0
        
        a.sort()
        b.sort()
        
        while(i<len(a) and j<len(b)):
            if(a[i]==b[j]):
                j+=1
            i+=1
            
        return j==len(b)