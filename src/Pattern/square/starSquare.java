package Pattern.square;

import java.util.Scanner;

public class starSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows and cols: ");
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){ //rows
            for (int j =1; j<=n ; j++){ //cols
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
