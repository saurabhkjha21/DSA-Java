package Methods;

import java.util.Scanner;

public class calculateSum {
    public static  int calculateTheSum(int a, int b) {
        int sum = a+b;
        return sum;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();

        int sum=calculateTheSum(a,b);
        System.out.println("Sum of 2 numbers is : "+ sum);

    }
}
