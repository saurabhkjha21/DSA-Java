package Revision.Loops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int n = sc.nextInt();

        for(int i = n; i<=n*10; i+=n){
            System.out.print(i+ " ");
        }
    }
}
