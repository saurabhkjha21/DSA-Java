package Methods;

import java.util.Scanner;

public class naturalNoSquare {
    public static void printSquare(int n) {
        if(n<0){
            System.out.println("Invalid Number.");
            return ;
        }
        for (int i=1; i<=n; i++){
            int square=i*i;
            System.out.println("Square of natural number " +i+ " is: "+ square);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printSquare(n);

    }


}
