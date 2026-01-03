package DP;
import java.util.*;
public class FibonacciNumber {
    // Fibonacci Number:- 0 1 1 2 3 5 8 13 21 34.....
    //f(n)=f(n-1)+f(n-2)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n = sc.nextInt();
        int result = SimpleFibonacci(n);
        System.out.println("Simple: "+result);
         result = IterativeFibonacci(n);
        System.out.println("Iterative: "+result);
        dp=new int[n+1];
        Arrays.fill(dp, -1);
        result = MemorizationFibonacci(n);
        System.out.println("Memorization: "+result);
    }
    public static int SimpleFibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return SimpleFibonacci(n-1) + SimpleFibonacci(n-2);
    }

    public static int IterativeFibonacci(int n){
        if(n==0) return 0;

        int a=0, b=1;
        for(int i=2; i<=n; i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
    static int[] dp;
    public static int MemorizationFibonacci(int n){
        if(n==0 || n==1) return n;
        if(dp[n]!=-1) return dp[n];
        dp[n]=MemorizationFibonacci(n-1)+MemorizationFibonacci(n-2);
        return dp[n];
    }
}
