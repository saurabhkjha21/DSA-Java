package Recursion;

import java.util.Scanner;

public class sumReturnType {
    public static int sum(int n){
        return (n==1 || n==0) ? n :n+sum(n-1);
//        if(n==1 || n==0){
//            return n;
//        }
//        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
