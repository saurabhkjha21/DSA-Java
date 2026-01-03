package Conditionals;

import java.util.Scanner;

public class findQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x-coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y-coordinate: ");
        int y = sc.nextInt();

        if(x>0 && y>0){
            System.out.println(" The point ("+ x +", "+ y +") lies in the 1st Quadrant.");
        }
        else if (x<0 && y>0){
            System.out.println(" The point ("+ x +", "+ y +") lies in the 2nd Quadrant.");
        }
        else if (x<0 && y<0) {
            System.out.println(" The point (" + x + ", " + y + ") lies in the 3rd Quadrant.");
        }
        else if (x>0 && y<0){
                System.out.println(" The point ("+ x +", "+ y +") lies in the 4th Quadrant.");
        }
        else if (x==0 && y!=0){
            System.out.println(" The point ("+ x +", "+ y +") lies in the y-axis.");
        }
        else if (y == 0 && x != 0){
            System.out.println(" The point ("+ x +", "+ y +") lies in the x-axis.");
        }
        else {
            System.out.println(" The point ("+ x +", "+ y +") lies in the  origin.");
        }

    }
}
