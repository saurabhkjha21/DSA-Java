package Pattern;
import java.util.Scanner;
public class PlusSign {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            int mid=(n/2)+1;
            for(int j=1; j<=n; j++){
                if(i==mid || j==mid){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println( );
        }
    }
}
