package Maths;

import java.util.Scanner;

public class ArmstrongNumber {
    /* 371 = 3^3 + 7^3 + 1^3 */
    //step 3: compare
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = armstrongNumber(n);
        if(n==ans){
            System.out.println("Armstrong Number.");
        }else{
            System.out.println("Not am armstrong number.");
        }

//        if(isArmstrong(n)){
//            System.out.println("Armstrong Number.");
//        }else{
//            System.out.println("Not am armstrong number.");
//        }



    }
    //Step 2: calculate total digits
    public static int armstrongNumber(int n){
        int temp=n;
        int sum=0;
        int digits = countDigit(n);
        while(temp>0){
            int ld = temp%10;
            sum += Math.pow(ld, digits);
            temp/=10;
        }
        return sum;
    }
    //Step 1 : Count total digits
    public static int countDigit(int n ){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
    /*Overall TC = O(log n)*/

//    public static int power(int base, int exp) {
//        int result = 1;
//        for (int i = 0; i < exp; i++) {
//            result *= base;
//        }
//        return result;
//    }
//    public static boolean isArmstrong(int n) {
//        int original = n;
//        int digits = countDigit(n);
//        int sum = 0;
//
//        while (n > 0) {
//            int ld = n % 10;
//            sum += power(ld, digits);   // NO Math.pow
//            n /= 10;
//        }
//
//        return sum == original;
//    }
}
