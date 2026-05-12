public class RowWithMax1 {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int res,max;
        res=-1;
        max=0;
        
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    count+=1;
                }
            }
            if(max<count){
                res=i;
                max=count;
            }
        }
        
        return res;
    }
}
