public class SumOfDigit {
    public static void main(String [] args){
        int n=12045;
        int result = sumOfDigits(n);
        System.out.println("Sum of digits in " + n + " is: " + result);
    }

    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
