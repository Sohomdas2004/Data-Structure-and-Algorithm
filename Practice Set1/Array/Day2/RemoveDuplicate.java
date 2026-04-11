import java.util.*;
public class RemoveDuplicate {
    public static void main(String [] args){
        int arr[]={1,2,1,3,4,5,5,6,7,8,9,9};
        int [] res=removeDuplicate(arr);
        System.out.println(Arrays.toString(res));
    }

    public static  int [] removeDuplicate(int [] arr){
        Set<Integer> set=new HashSet<>();
        
        for(int n:arr){
            set.add(n);
        }

        int [] res=new int[set.size()];
        int index=0;
        
        for(int n:set){
            res[index]=n;
            index+=1;
        }
        
        return res;
    }
}
