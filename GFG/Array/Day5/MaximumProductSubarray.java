public class MaximumProductSubarray {
    int maxProduct(int[] arr) {
        // code here
        int max,curmax,curmin;
        curmax=1;
        curmin=1;
        max=arr[0];
        
        for(int n:arr){
            if(n==0){
                curmax=1;
                curmin=1;
                max=Math.max(0,max);
                continue;
            }
            
            int temp=curmax;
            curmax=Math.max(temp*n,Math.max(curmin*n,n));
            curmin=Math.min(temp*n,Math.min(curmin*n,n));
            max=Math.max(curmax,max);
        }
        
        return max;
    }
}
