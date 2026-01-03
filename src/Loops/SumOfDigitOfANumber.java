package Loops;
import java.util.Scanner;
public class SumOfDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=ld;
            n=n/10;
        }
        System.out.print("The Sum Is: "+sum);

    }
}
