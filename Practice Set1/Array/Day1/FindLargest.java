public class FindLargest {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 8, 2};
        int largest = findLargest(numbers);
        System.out.println("The largest number is: " + largest);
    }

    public static int findLargest(int[] arr) {
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>res){
                res=arr[i];
            }
        }
        return res;
    }
}