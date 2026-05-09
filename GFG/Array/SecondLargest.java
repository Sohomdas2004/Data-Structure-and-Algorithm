public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // code here
        int max,max2;
        max=arr[0];
        max2=-1;
        
        for(int n:arr){
            if(n>max){
                max2=max;
                max=n;
            }
            else if(n>max2 && n<max){
                max2=n;
            }
        }
        
        return max2;
    }

}
