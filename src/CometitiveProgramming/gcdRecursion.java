package CometitiveProgramming;

import java.util.Scanner;

public class gcdRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();

        int ans = gcd(a, b);
        System.out.println("The GCD of Two Number is : " + ans);
    }
    private static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}