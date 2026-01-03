package CometitiveProgramming;

import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch>=65 && ch<=90) System.out.println("uppercase");
        else if((ch>=33 && ch<=48) || (ch>=58 && ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=126)) System.out.println(37);
        else if(ch>=97 && ch<=122) System.out.println("lowercase");
        else System.out.println("digits");
    }
}
