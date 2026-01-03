package Conditionals;

import java.util.Scanner;

public class aorVSpor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        double l = sc.nextInt();
        System.out.print("Enter width : ");
        double w = sc.nextInt();

        double aor = l*w;
        System.out.println("The area of rectangle is : "+aor);
        double por = (l+w)*2;
        System.out.println("The Perimeter of rectangle is : "+por);

        if(aor>por){
            System.out.println("AOC is greater");
        }
        else{
            System.out.println("POC is greater");
        }
    }
}
