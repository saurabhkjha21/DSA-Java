package Conditionals;

import java.util.Scanner;

public class ps_absolute_val {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        if(n<0) System.out.println("The absolute value is : "+ -n );
        else System.out.println("The absolute value is : "+ n );
    }
}
