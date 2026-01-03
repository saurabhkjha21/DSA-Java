package Pattern.Practise01;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int s = 0; s <=n-i; s++) { //print space
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
