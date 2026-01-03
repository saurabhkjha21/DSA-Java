package Methods;

import java.util.Scanner;

public class calculateMultiplication {
    public static int calculateMul( int a, int b) {
        int mul = a*b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the 1st num: ");
        int  a = sc.nextInt();
        System.out.print("Enter the 2nd num: ");
        int  b = sc.nextInt();

        int mul=calculateMul(a,b);
        System.out.print("The multiplication of 2 numbers is : "+ mul);

    }
}
