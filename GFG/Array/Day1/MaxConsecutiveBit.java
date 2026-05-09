public class MaxConsecutiveBit {
    public int maxConsecBits(int[] arr) {
        // code here
        if(arr.length==1){
            return 1;
        }
        
        int res,count;
        res=0;
        count=1;
        
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count+=1;
            }
            else{
                count=1;
            }
            
            res=Math.max(res,count);
        }
        
        return res;
    }
}
