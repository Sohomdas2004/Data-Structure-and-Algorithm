public class RemoveAllExceptAlphabet {
    public String removeChars(String s) {
        // code here
        StringBuilder res=new StringBuilder();
        
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                res.append(ch);
            }
        }
        
        return res.toString();
    }
}

//Input: s = "$Gee*k;s..fo, r'Ge^eks?"
//Output: "GeeksforGeeks"
//Explanation: All characters other than alphabets are removed from the string 
//"$Gee*k;s..fo, r'Ge^eks?", resulting in "GeeksforGeeks". 