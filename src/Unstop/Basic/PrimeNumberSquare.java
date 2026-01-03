package Unstop.Basic;
import java.util.*;
public class PrimeNumberSquare {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int num=2;
        int max=0;
        int lastPrime=0;
        while(count<n){
            if(isPrime(num)){
                lastPrime=num;
                count++;
            }
            num++;
        }
        System.out.println(lastPrime*lastPrime);
    }

    private static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
