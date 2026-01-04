package Maths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int org=num;
        int rev=0;
        while(num>0){
            int ld = num%10; //get last digit
            rev= rev*10 + ld;
            num /= 10;//remove last digit
        }
        System.out.println("Reverse Number: "+rev);
        if(rev==org){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a palindrome.");
        }

    }
}
