public class Swap {
    public static void main(String [] args) {
        int a=5;
        int b=10;
        System.out.println("Before swapping: a="+a+" b="+b);
        swap(a,b);
    }

    public static void swap(int x, int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping: a="+x+" b="+y);
    }
}
