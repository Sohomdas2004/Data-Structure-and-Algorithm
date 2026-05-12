import java.util.*;


public class RemoveDuplicatesFromUnsorted {
    public static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        
        for(int n:arr){
            if(!set.contains(n)){
                res.add(n);
                set.add(n);
            }
        }
        
        return res;
    }
}
