public class ReverseArray {
    public void reverseArray(int arr[]) {
        // code here
        if(arr.length==1){
            return;
        }
        
        int start,end;
        start=0;
        end=arr.length-1;
        
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start+=1;
            end-=1;
        }
        
        
    }
}
