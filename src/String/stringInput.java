package String;

import java.util.Scanner;

public class stringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String str = sc.nextLine();
        String s="Hello";
        System.out.print(s);
        System.out.print(" "+str);
        //Built-in Functions
        String a="Saurabh Jha";
        System.out.println(a.charAt(7));
        System.out.println(a.charAt(10));
        System.out.println(a.length());


    }
}
