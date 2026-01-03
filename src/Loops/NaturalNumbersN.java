package Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NaturalNumbersN {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            System.out.print(i + " ");
        }
}
}
