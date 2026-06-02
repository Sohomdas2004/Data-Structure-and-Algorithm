import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=(int)nums.length/2;

        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }

        for(int num:map.keySet()){
            if(map.get(num)>n){
                return num;
            }
        }

        return -1;
    }
}
