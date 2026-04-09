public class FibonacciSeries {
    public static void main(String [] args){
        int n=5;
        System.out.println("Fibonacci series up to " + n + " terms:");
        fibo(n);
    }

    public static void fibo(int n){
        int a,b,c;
        a=0;
        b=1;
        System.out.print(a+" "+b+" ");
        for(int i=3;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
