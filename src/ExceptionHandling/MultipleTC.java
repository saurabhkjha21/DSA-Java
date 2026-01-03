package ExceptionHandling;

public class MultipleTC {
    public static void main(String[] args) {


        try {
            int a = 10, b = 2, c = a / b;
            System.out.println(c);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
            System.out.println("Cant divided by 0");
        }
        try {
            int arr[] = {10, 20, 30, 40};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println(aiobe);
            System.out.println("Beyond the array limit.");
        }
    }
}