package Pattern.square;

import java.util.Scanner;

public class hollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j = 1; j <=n ; j++) {
                if(j<=2|| j==n || i<=2 || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
