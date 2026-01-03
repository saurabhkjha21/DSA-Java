package Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class APof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n =sc.nextInt();

        for(int i = 4; i <= 3*n; i+=3){
            System.out.println(i +" ");
        }
    }



}
