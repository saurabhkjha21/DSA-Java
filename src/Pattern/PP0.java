package Pattern;
import java.util.Scanner;
public class PP0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter n: ");
        int m = sc.nextInt();

        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
