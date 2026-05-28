public class Palindrome {
    boolean isPalindrome(String s) {
        // code here
        int start,end;
        start=0;
        end=s.length()-1;
        
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start+=1;
            end-=1;
        }
        
        return true;
    }
}
