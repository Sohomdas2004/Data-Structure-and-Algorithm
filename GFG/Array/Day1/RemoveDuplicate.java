import java.util.ArrayList;

public class RemoveDuplicate {
   public static ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            res.add(arr[i]);
        }
        
        return res;
    }
}
