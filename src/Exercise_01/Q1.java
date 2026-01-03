package Exercise_01;

import java.util.Scanner;

public class Q1 {
    public int printAverage(int a, int b, int c){
        int sum = (a+b+c);
        int average = sum/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 1st number: ");
        int b = sc.nextInt();
        System.out.print("Enter 1st number: ");
        int c = sc.nextInt();
        Q1 obj = new Q1();
        int avg = obj.printAverage(a,b,c);
        System.out.println(avg);
    }
}
