class Solution:
    def findUnion(self, a, b):
        # code here 
        i=0
        j=0
        res=[]
        
        while(i<len(a) and j<len(b)):
            if(i>0 and a[i]==a[i-1]):
                i+=1
                continue
            
            if(j>0 and b[j]==b[j-1]):
                j+=1
                continue
            
            if(i>len(a) or j>len(b)):
                break
            
            if(a[i]<b[j]):
                res.append(a[i])
                i+=1
            
            elif(b[j]<a[i]):
                res.append(b[j])
                j+=1
            
            else:
                res.append(a[i])
                i+=1
                j+=1
                
        while(i<len(a)):
            if(i>0 and a[i]==a[i-1]):
                i+=1
                continue
            res.append(a[i])
            i+=1
            
        while(j<len(b)):
            if(j>0 and b[j]==b[j-1]):
                j+=1
                continue
            res.append(b[j])
            j+=1
            
        return res