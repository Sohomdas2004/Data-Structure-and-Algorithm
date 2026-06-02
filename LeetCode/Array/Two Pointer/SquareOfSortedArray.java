//Leetcode 977. Square of a Sorted Array

public class SquareOfSortedArray {
    
    public int[] sortedSquares(int[] nums) {
        int [] res=new int[nums.length];
        int index=nums.length-1;
        int left,right;
        left=0;
        right=nums.length-1;

        while(left<=right){
            int num;
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                num=nums[left]*nums[left];
                left+=1;
            }
            else{
                num=nums[right]*nums[right];
                right-=1;
            }
            res[index--]=num;
        }
        return res;
    }

}
