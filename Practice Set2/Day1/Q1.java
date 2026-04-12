// Question 1: Given,maximum of 100 digit numbers as input,find the difference between the sum of
// odd and even postions of the digits of the number.
import java.util.Scanner;

public class Q1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println( diff(num));
    }

    public static int diff(String num){
        int oddSum,evenSum;
        oddSum=0;
        evenSum=0;

        for(int i=0;i<num.length();i++){
            int n=(int)num.charAt(i);
            if((i+1)%2==0){
                evenSum+=n;
            }
            else{
                oddSum+=n;
            }
        }

        return Math.abs(oddSum-evenSum);
    }
}
