package Maths;

import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        divisors(n);
        System.out.println();
        optimalDivisors(n);
    }
    public static void divisors(int n){
        for(int i=1; i<=n; i++){ //iterate till n
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void optimalDivisors(int n){
        for(int i=1; i*i<=n; i++){ //iterate till √n
            if(n%i==0){
                System.out.print(i+" ");
                if(i!=n/i){
                    System.out.print(n/i+" ");
                }
            }
        }
    }
}
