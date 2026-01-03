package Conditionals;

import java.util.Scanner;

public class findQuad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x-axis: ");
        int x = sc.nextInt();
        System.out.print("Enter y-axis: ");
        int y = sc.nextInt();

        if(x>0) {
            if (y > 0) {
                System.out.println("the point (" + x + " , " + y + ") lies in the 1st quadrant.");
            } else if (y < 0) {
                System.out.println("The point (" + x + " , " + y + ") lies in the 4th quadrant.");
            } else {
                System.out.println("The point (" + x + " , " + y + ") lies on the x-axis.");
            }
        }
        else if (x<0){
                if (y>0){
                    System.out.println("The point ("+ x +" , "+ y +" lies 2nd quadrant.)");
                }
                else if (y<0){
                    System.out.println("The point "+ x +" , "+ y +" lies in the 3rd quadrant.");
                }
                else{
                    System.out.println("The point "+ x +" , "+ y +" lies on the x-axis.");
                }
        }
        else {
            if(y!=0){
                System.out.println("The point "+ x +" , "+ y +" lies on the y-axis.");
            }
            else{
                System.out.println("The point "+ x +" , "+ y +" lies at the origin.");
            }
        }


    }
}
