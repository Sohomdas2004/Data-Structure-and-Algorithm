//Leetcode 11. Container With Most Water

class ContainMostWater {
    public int maxArea(int[] height) {
        int res=0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            int area=(right-left)*Math.min(height[left],height[right]);
            res=Math.max(area,res);

            if(height[left]>height[right]){
                right-=1;
            }
            else{
                left+=1;
            }
        }

        return res;
    }
}