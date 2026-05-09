public class Largest {
    public static int largest(int[] arr) {
        // code here
        int res=-1;
        
        for(int n:arr){
            if(n>res){
                res=n;
            }
        }
        
        return res;
    }
}
