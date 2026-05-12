import java.util.Arrays;

public class MedianOfAnArray{
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        if(arr.length%2==0){
            return (arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;
        }
        return (double)arr[(arr.length)/2];
    }
}