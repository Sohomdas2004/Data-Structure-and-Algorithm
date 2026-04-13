// This series is a mixture of 2 series all the odd terms in the series form the fibonacci series and 
// all the even terms will be the prime number in ascending order write the program to find the nth 
// term of the program 

import java.util.Scanner;

public class Q2{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1){
            System.out.println(fibonacci((n+1)/2));
        }else{
            System.out.println(NthPrime(n/2));
        }
            
    }

    public static int fibonacci(int n){
         if (n == 1) return 0;
        if (n == 2) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int NthPrime(int n){
        int count,num;
        count=0;
        num=2;
        while(count<n){
            if(isPrime(num)){
                count+=1;
            }
            num+=1;
        }
        return num-1;
    }
}