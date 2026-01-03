package Pattern.Triangle;

import java.util.Scanner;

public class mixNumAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. ");
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){ //rows
            if(i%2==1) {
                for (int j = 1; j <= i; j++) { //cols
                    System.out.print(j + " ");
                }
            }
                else{
                for (int j = 1; j <= i; j++) {
                    System.out.print((char) (j + 64) + " ");
                }
            }
            System.out.println();
        }
    }
}
