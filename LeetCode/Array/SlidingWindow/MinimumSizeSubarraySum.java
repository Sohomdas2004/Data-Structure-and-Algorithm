//LeetCode 209. Minimum Size Subarray Sum
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left,right,sum,num,res;
        sum=0;
        
        for(int n:nums){
            sum+=n;
        }

        if(target>sum){
            return 0;
        }

        left=0;
        right=0;
        res=nums.length;
        num=0;

        while(right<nums.length){
            num+=nums[right];

            while(num>=target){
                if(res>right-left+1){
                    res=right-left+1;
                }
                num-=nums[left];
                left+=1;
            }

            right+=1;
        }

        return res;
    }
}
