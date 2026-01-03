package Exercise_01;

import java.util.Scanner;

public class Q2 {
    public static void printOdd(int n){
        for(int i=0; i<=n; i++){
            if(i%2!=0) System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printOdd(n);
    }
}
