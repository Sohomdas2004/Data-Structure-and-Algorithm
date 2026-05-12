import java.util.*;

public class FrequenciesInALimitedArray{
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int n:arr){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
                continue;
            }
            map.put(n,1);
        }
        
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i=1;i<=arr.length;i++){
            if(map.containsKey(i)){
                res.add(map.get(i));
                continue;
            }
            res.add(0);
        }
        
        return res;
    }
}