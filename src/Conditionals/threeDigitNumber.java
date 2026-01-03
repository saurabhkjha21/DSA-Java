package Conditionals;

import java.util.Scanner;

public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(9999<n && n<100000) {
            System.out.println("5 Digit Number.");
        }
        else{
            System.out.println("Not a 5 digit number.");
        }

    }
}
