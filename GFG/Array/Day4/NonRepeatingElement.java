import java.util.*;

public class NonRepeatingElement {
     public int firstNonRepeating(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int n:arr){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        
        for(int n:arr){
            if(map.get(n)==1){
                return n;
            }
        }
        return 0;
    }
}
