package Recursion;

import java.util.Scanner;

public class NameNTimes {
    public static void recursivePrint(int n, String s){
        if(n==0) return;
        System.out.println(s);
        recursivePrint(n-1, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        String s = "Saurabh";
        recursivePrint(n,s);
    }
}
