package Pattern;

import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<m; j++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
