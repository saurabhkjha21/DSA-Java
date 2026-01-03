package Loops;

import java.util.Scanner;

public class GP3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int a =3;
        for(int i=1; i<=n; i++){
            System.out.print(a+ " ");
            a *= 4;

        }
    }
}
