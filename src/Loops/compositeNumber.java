package Loops;

import java.util.Scanner;

public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int x =0;
        for (int i = 2; i<=n; i++){
            if(n%i==0){
                System.out.print("Composite Number");
                x = 1; // 1means composite
                break;
            }
        }
        if(n==1) System.out.println(" Neither prime nor Composite");
        else if(x==0) System.out.print("Prime Number.");
    }
}
