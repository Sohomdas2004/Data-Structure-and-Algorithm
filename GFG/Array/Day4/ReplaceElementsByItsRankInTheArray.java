import java.util.Arrays;
import java.util.HashMap;

public class ReplaceElementsByItsRankInTheArray {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        int [] temp=new int[N];
        int [] res=new int[N];
        HashMap<Integer,Integer> map=new HashMap<>();
        int index=0;
        
        for(int n:arr){
            temp[index++]=n;
        }
        
        Arrays.sort(temp);
        int rank=1;
        
        for(int n:temp){
            if(!map.containsKey(n)){
                map.put(n,rank++);
            }
        }
        
        index=0;
        
        for(int n:arr){
            res[index++]=map.get(n);
        }
        
        return res;
    }
}
