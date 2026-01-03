package Loops;

import java.util.Scanner;

public class TableOfNpq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = n; i<=n*10; i+=n){
            System.out.print(i+ " ");
        }
    }
}
