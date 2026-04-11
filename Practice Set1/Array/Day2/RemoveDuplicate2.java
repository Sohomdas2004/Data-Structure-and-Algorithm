import java.util.Arrays;

public class RemoveDuplicate2 {
    public static void main(String [] args){
        int arr[]={1,2,1,3,4,5,5,6,7,8,9,9};
        int [] res=removeDuplicate(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int [] removeDuplicate(int [] arr){
        int index=0;
        int i=0;
        Arrays.sort(arr);  
        while(i<arr.length-1){
            if(arr[i]==arr[i+1]){
                arr[index]=arr[i];
                index+=1;
                i+=2;
            }else{
                arr[index]=arr[i];
                index+=1;
                i+=1;
            }
        }

        int [] res=new int[index];

        for(int j=0;j<index;j++){
            res[j]=arr[j];
        }

        return res;
    }
}
