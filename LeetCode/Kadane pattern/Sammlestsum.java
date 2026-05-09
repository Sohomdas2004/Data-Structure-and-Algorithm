public class Sammlestsum {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        if(a.length==1){
            return a[0];
        }
        
        int cursum,res;
        res=a[0];
        cursum=0;
        
        for(int n:a){
            if(cursum>0){
                cursum=0;
            }
            cursum+=n;
            res=Math.min(cursum,res);
        }
        
        return res;
    }
}
