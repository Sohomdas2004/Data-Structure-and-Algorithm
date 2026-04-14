public interface Anagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        boolean result=areAnagrams(str1,str2);
        if(result){
            System.out.println(str1+" and "+str2+" are anagrams.");
        }else{
            System.out.println(str1+" and "+str2+" are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        int [] arr=new int[26];

        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)-'a']=arr[str1.charAt(i)-'a']+1;
            arr[str2.charAt(i)-'a']=arr[str2.charAt(i)-'a']-1;
        }

        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
