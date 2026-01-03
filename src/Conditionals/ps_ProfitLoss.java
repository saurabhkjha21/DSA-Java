package Conditionals;

import java.util.Scanner;

public class ps_ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP : ");
        int cp = sc.nextInt();
        System.out.print("Enter SP : ");
        int sp = sc.nextInt();

        if(sp>cp){
            System.out.print("Profit of "+ (sp-cp) + " rupees." );
        }
        else if(sp<cp){
            System.out.print("Loss of "+ (cp-sp) + " rupees.");
        }
        else System.out.println("Not Profit , No Loss.");
    }
}
