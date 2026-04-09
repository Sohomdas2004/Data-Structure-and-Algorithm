public class CountDigit {
    public static void main(String [] args){
        int n=12045;
        int result = countDigits(n);    
        System.out.println("Number of digits in " + n + " is: " + result);
    }

    public static int countDigits(int n){
        int count=0;
        while(n>0){
            count+=1;
            n=n/10;
        }
        return count;
    }
}
