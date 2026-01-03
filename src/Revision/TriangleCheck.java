package Revision;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Side: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Side: ");
        int b = sc.nextInt();
        System.out.print("Enter 1st Side: ");
        int c = sc.nextInt();

        if(a==b && b==c){
            System.out.println("Equilateral Triangle");
        } else if (a==b && b!=c) {
            System.out.println("Isosceles");
        }
        else{
            System.out.println("Scalene");
        }

    }
}
