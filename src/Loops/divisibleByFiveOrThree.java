package Loops;

import java.util.Scanner;

public class divisibleByFiveOrThree {
    public static void main(String[] args) {


        for(int i =1 ; i<=100; i++){
            if(i%5==0 || i%3==0) System.out.println(i);
        }
    }
}
