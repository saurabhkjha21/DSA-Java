package Pattern.SpecialPattern;

import java.util.Scanner;

public class oddNumTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. ");
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){ //rows
            for (int j =1; j<=i ; j++){ //cols
                System.out.print(2*j-1 +" ");
            }
            System.out.println();
        }
    }
}
