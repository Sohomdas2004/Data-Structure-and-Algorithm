//GreeksforGreeks Max Sum Subarray of size K

class MaximumSubarray {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int res=0;
        
        for(int i=0;i<k;i++){
            res+=arr[i];
        }
        
        int num=res;
        
        for(int i=k;i<arr.length;i++){
            num=num+arr[i]-arr[i-k];
            if(res<num){
                res=num;
            }
        }
        
        return res;
    }
}