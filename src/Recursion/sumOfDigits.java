package Recursion;

import java.util.Scanner;

public class sumOfDigits {
    public static int recursiveSum(int n){
        if(n==0) return 0;
        return (n%10)+recursiveSum(n/10);

    }
    public static void recursiveSumVoid(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        recursiveSumVoid(n/10, sum+(n%10));

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursiveSum(n));
        recursiveSumVoid(n,0);

    }
}
