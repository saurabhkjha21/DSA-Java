package Loops;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n= sc.nextInt();
        boolean isPrime=true;

        if(n<=1){
            isPrime=false;
        }
        else{
            int i=2;
            while(i<=n/2){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
                i++;
            }
        }
        if(isPrime){
            System.out.println(n+" is a Prime Number.");
        }
        else{
            System.out.println("Not a Prime Number.");
        }


    }
}
