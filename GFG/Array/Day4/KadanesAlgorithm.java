public class KadanesAlgorithm {
    public int maxSubarraySum(int[] arr) {
        // Code here
        int cursum,maxsum;
        cursum=0;
        maxsum=arr[0];
        
        for(int n:arr){
            if(cursum<0){
                cursum=0;
            }
            cursum+=n;
            maxsum=Math.max(cursum,maxsum);
        }
        
        return maxsum;
    }
}
