package Recursion;

import java.util.Scanner;

public class hcfRec {
    public static int hcf(int a, int b){
        for (int i = Math.min(a,b); i >=1 ; i--) {
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no. :- ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no. :- ");
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
}
