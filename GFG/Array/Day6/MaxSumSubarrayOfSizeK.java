public class MaxSumSubarrayOfSizeK {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int res,num;
        res=0;
        num=0;
        
        for(int i=0;i<k;i++){
            num+=arr[i];
        }
        
        res=num;
        
        for(int i=k;i<arr.length;i++){
            num=num+arr[i]-arr[i-k];
            if(num>res){
                res=num;
            }
        }
        
        return res;
    }
}
