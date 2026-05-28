public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }
        
        int[] arr=new int[26];
        
        for(char ch:s1.toCharArray()){
            arr[ch-'a']=arr[ch-'a']+1;
        }
        
        for(char ch:s2.toCharArray()){
            arr[ch-'a']=arr[ch-'a']-1;
        }
        
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        
        return true;
    }
}
