public class RemoveCharacter {
    static String removeChars(String str1, String str2) {
        // code here
        StringBuilder res=new StringBuilder();
        for(char ch:str1.toCharArray()){
            if(str2.indexOf(ch)==-1){
                res.append(ch);
            }
        }
        return res.toString();
    }
}


//Input: str1 = "computer", str2= "cat"
//Output: "ompuer"
//Explanation: After removing characters(c, a, t) from string1 we get "ompuer".