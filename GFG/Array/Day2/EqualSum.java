public class EqualSum{
    String equilibrium(int arr[]) {
        // code here
        int sum=0;
        
        for(int n:arr){
            sum+=n;
        }
        
        int leftsum=0;
        
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
            if(leftsum==sum){
                return "true";
            }
            leftsum+=arr[i];
            // sum-=arr[i];
        }
        
        return "false";
    }
}