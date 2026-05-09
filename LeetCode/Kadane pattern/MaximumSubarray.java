//Leetcode 53-MaximumSubarray
public class MaximumSubarray{
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }

        int res,cursum;
        res=nums[0];
        cursum=0;

        for(int n:nums){
            if(cursum<0){
                cursum=0;
            }
            cursum+=n;
            res=Math.max(res,cursum);
        }

        return res;
    }
}