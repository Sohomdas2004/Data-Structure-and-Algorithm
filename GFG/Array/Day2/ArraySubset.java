import java.util.Arrays;

public class ArraySubset{
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        int i,j;
        i=0;
        j=0;
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                j+=1;
            }
            i+=1;
        }
        
        return j==b.length;
    }
}