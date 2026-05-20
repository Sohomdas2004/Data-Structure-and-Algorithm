import java.util.*;

class Solution {
    static void relativeSort(int[] a1, int[] a2) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        
        for(int n:a1){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }
            else{
                map.put(n,1);
            }
        }
        
        for(int n:a2){
            if(map.containsKey(n)){
                for(int i=0;i<map.get(n);i++){
                    arr.add(n);
                }
            }
            map.remove(n);
        }
        
        for(int n:map.keySet()){
            for (int i=0;i<map.get(n); i++) {
                arr2.add(n);
            }
        }
        
        Collections.sort(arr2);
        
        int index=0;
        
        for(int n:arr){
            a1[index++]=n;
        }
        
        for(int n:arr2){
            a1[index++]=n;
        }
    }
}

//Input: a1[] = [2, 1, 2, 3, 4], a2[] = [2, 1, 2]
//Output: [2, 2, 1, 3, 4]