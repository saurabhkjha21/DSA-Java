package Loops;
import java.util.Scanner;
public class MulN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int mul=1;

        for(int i =1; i<=n; i++){
            mul*=i;
        }
        System.out.print("The Mul is : "+mul);

    }
}
