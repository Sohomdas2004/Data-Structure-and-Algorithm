//Leetcode 16 - 3SumClosest
import java.util.*;

class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {

        int res=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);

        if(nums.length==3){
            return res;
        }

        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int cursum=nums[left]+nums[right]+nums[i];
                if(cursum==target){
                    res=cursum;
                    break;
                }

                if(Math.abs(target-res)>Math.abs(target-cursum)){
                    res=cursum;
                }
                else if(cursum<target){
                    left+=1;
                }
                else{
                    right-=1;
                }
            }
        }

        return res;
    }
}