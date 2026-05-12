import java.util.ArrayList;

public class UnionOf2SortedArray {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {

            
            while (i > 0 && i < a.length && a[i] == a[i - 1]) {
                i++;
            }

            
            while (j > 0 && j < b.length && b[j] == b[j - 1]) {
                j++;
            }

            
            if (i >= a.length || j >= b.length) {
                break;
            }

            if (a[i] < b[j]) {
                res.add(a[i]);
                i++;
            }
            else if (a[i] > b[j]) {
                res.add(b[j]);
                j++;
            }
            else {
                res.add(a[i]);
                i++;
                j++;
            }
        }

        
        while (i < a.length) {
            if (i == 0 || a[i] != a[i - 1]) {
                res.add(a[i]);
            }
            i++;
        }

        
        while (j < b.length) {
            if (j == 0 || b[j] != b[j - 1]) {
                res.add(b[j]);
            }
            j++;
        }

        return res;
    }
}
