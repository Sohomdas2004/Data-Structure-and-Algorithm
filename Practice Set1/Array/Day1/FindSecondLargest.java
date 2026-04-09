public class FindSecondLargest {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 8, 2,9};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest number is: " + secondLargest);
    }

    public static int findSecondLargest(int [] arr) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}
