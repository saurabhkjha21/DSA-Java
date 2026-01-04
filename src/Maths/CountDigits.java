package Maths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n==0){
            System.out.println("Total Digit: 1");
            return;
        }
        int count=0;
        while(n>0){
            n=n/10; //remove last digit
            count++;
        }
        System.out.println("Total digit: "+count);
        /*Time Complexity: O(log₁₀ n)
        SC = O(1) (Constant space)*/
    }
}
