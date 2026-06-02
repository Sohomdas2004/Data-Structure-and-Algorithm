//Leetcode 167. Two Sum II - Input Array Is Sorted
class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int res[]=new int[2];
        int start,end;
        start=0;
        end=numbers.length-1;
        res[0]=-1;
        res[1]=-1;

        while(start<=end){
            if(numbers[start]+numbers[end]==target){
                res[0]=start+1;
                res[1]=end+1;
                break;
            }
            else if(numbers[start]+numbers[end]<target){
                start+=1;
            }
            else{
                end-=1;
            }
        }

        return res;
    }
}
