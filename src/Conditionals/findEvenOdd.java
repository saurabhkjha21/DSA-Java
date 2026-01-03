package Conditionals;

import java.util.Scanner;

public class findEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n%2 == 0) System.out.println("The number "+ n +" is even ");
        else System.out.println("The number "+ n +" is odd  ");
    }
}
