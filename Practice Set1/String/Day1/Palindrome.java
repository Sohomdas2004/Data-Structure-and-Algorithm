public class Palindrome {
    public static void main(String [] args){
        String s="madam";
        System.out.println("Is " + s + " a palindrome? " + isPallindrome(s));
    }

    public static boolean isPallindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left+=1;
            right-=1;
        }
        return true;
    }
}
