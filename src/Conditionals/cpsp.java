package Conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class cpsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter C.P : ");
        int cp = sc.nextInt();
        System.out.print("Enter S.P : ");
        int sp = sc.nextInt();


        if(sp>cp){
            System.out.print("Profit is ");
            System.out.println(sp-cp);
        }
        else if(cp > sp){
            System.out.print("Loss is "+(cp-sp));
        }
        else {
            System.out.println("No profit No Loss");
        }
    }
}
