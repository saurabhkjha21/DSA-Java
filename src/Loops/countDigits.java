package Loops;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();

        //int count = 0;
        int sum = 0;
        while(n!=0){
            //int last_digit = n%10;
            sum+=(n%10);
            n/=10;
            //sum++;
        }
        System.out.println(sum);
    }
}
