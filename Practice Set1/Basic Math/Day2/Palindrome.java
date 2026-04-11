public class Palindrome {
    public static void main(String [] args) {
        int num=12321;
        if(isPalindrome(num)){
            System.out.println(num+" is a palindrome number.");
        }else{
            System.out.println(num+" is not a palindrome number.");
        }
    }

    public static boolean isPalindrome(int num){
        int temp=num;
        int rev=0;
        while(temp>0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        return rev==num;
    }
}
