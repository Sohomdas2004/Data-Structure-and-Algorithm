public class Factorial{
    public static void main(String [] args){
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int res=1;
        for(int i=2;i<=n;i++){
            res*=i;
        }
        return res;
    }
}