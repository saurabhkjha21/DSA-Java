package Patterns;
import java.util.Scanner;
public class diamodstarpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int totalRows=2*n-1;

        for(int i=1; i<=totalRows; i++){
            int row = (i<=n) ? i : (2*n - i);

            for(int j =1; j<=n-row; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*row -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
