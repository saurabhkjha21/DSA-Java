package Exercise_01;

import java.util.Scanner;

public class Q1a {
    public void printAverage(int a, int b, int c){
        int sum = (a+b+c);
        int average = sum/3;
        System.out.println(average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 1st number: ");
        int b = sc.nextInt();
        System.out.print("Enter 1st number: ");
        int c = sc.nextInt();
        Q1a obj = new Q1a();
        obj.printAverage(a,b,c);
    }
}
