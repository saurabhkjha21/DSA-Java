package Conditionals;

import java.util.Scanner;

public class ageOfRamShyamAjay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Ram : ");
        int r = sc.nextInt();
        System.out.print("Enter age of Shyam : ");
        int s = sc.nextInt();
        System.out.print("Enter age of Ajay : ");
        int a = sc.nextInt();

        if(r<s){
            if(r<a) System.out.println("Ram is youngest.");
            else System.out.println("Ajay is youngest.");
        }
        else {
            if(s<a) System.out.println("Shyam is youngest.");
            else System.out.println("Ajay is youngest.");
        }
    }
}
