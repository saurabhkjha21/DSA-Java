package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        //1 3 5 7.....n
        for(int i = 1; i<= 2*n-1; i+=2){
            System.out.println(i);
        }
    }
}
