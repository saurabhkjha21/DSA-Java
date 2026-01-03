package Conditionals;

import java.util.Scanner;

public class psLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Year: ");
        int yr = sc.nextInt();

        if(yr%4==0 && yr%100!=0  || yr%400==0){
            System.out.println(yr +" is a leap year.");
        }
        else{
            System.out.print(yr + " is not a leap year.");
        }
    }
}
