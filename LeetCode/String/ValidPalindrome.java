//LeetCode 125. Valid Palindrome

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                res.append(Character.toLowerCase(c));
            }
        }

        int start,end;
        start=0;
        end=res.length()-1;
        while(start<end){
            if(res.charAt(start)!=res.charAt(end)){
                return false;
            }
            start+=1;
            end-=1;
        }
        return true;
    }
}