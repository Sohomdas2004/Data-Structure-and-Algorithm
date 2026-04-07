public class ReverseString {
    public static void main(String [] args){
        String s="Hello World";
        System.out.println("The reverse of " + s + " is: " + reverseString(s));
    }

    public static String reverseString(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}