public class RemoveVowel {
    String removeVowels(String s) {
        // code here
        String vowel="aeiouAEIOU";
        StringBuilder res=new StringBuilder();
        
        for(char ch:s.toCharArray()){
            if(vowel.indexOf(ch)==-1){
                res.append(ch);
            }
        }
        
        return res.toString();
    }
}
