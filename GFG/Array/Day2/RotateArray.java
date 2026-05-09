public class RotateArray{
    public static void rotateArr(int arr[], int d) {
        // code here
        int res[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            res[i]=arr[(i+d)%arr.length];
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=res[i];
        }
    }
}