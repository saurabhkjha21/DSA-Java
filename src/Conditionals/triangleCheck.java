package Conditionals;

import java.util.Scanner;

public class triangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of 1st side: ");
        double a = sc.nextDouble();
        System.out.println("Enter length of 2nd side: ");
        double b = sc.nextDouble();
        System.out.println("Enter length of 3rd side: ");
        double c = sc.nextDouble();

        if(a == b && b == c){
            System.out.println("The triangle is Equilateral.");
        }
        else if (a == b || b == c || a==c){
            System.out.println("The Triangle is an Isosceles.");
        }
        else System.out.println("The triangle is Scalene.");
    }
}
