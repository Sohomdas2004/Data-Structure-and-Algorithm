import java.util.*;

class TripletsWithSmallerSum {
    int countTriplets(int sum, int arr[]) {
        // code here
        int count=0;
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            int left,right;
            left=i+1;
            right=arr.length-1;
            
            while(left<right){
                if(arr[i]+arr[left]+arr[right]<sum){
                    count+=right-left;
                    left+=1;
                }
                else{
                    right-=1;
                }
            }
        }
        
        return count;
        
    }   
}
