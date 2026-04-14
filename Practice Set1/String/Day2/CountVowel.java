public class CountVowel{
    public static void main(String[] args) {
        String str="Hello World";
        int count=countVowel(str);
        System.out.println("Number of vowels in the string: "+count);
    }

    public static int countVowel(String str){
        int count=0;
        String vowel="aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            if(vowel.indexOf(str.charAt(i))!=-1){
                count+=1;
            }
        }
        return count;
    }
}