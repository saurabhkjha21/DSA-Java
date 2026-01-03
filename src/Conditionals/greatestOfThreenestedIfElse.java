package Conditionals;

import java.util.Scanner;

public class greatestOfThreenestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st NUmber: ");
        int a =  sc.nextInt();
        System.out.print("Enter 2nnd NUmber: ");
        int b =  sc.nextInt();
        System.out.print("Enter 3rd NUmber: ");
        int c =  sc.nextInt();

        if (a>b){
            if(a>c) System.out.println(a+ " is greatest");
            else // c>a>b
                System.out.println(c+ " is greatest");
        }
        else {
            if(b>c) System.out.println(b+ " is greatest");
            else System.out.println(c+ " is greatest");
        }
    }
}
