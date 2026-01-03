package Pattern.Practise01;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            int val;

            if(i%2==0){
                val=0;
            }
            else{
                val=1;
            }


            for (int j = 1; j <=i ; j++) {
                System.out.print(val);
                val=1-val; //flip value (1-->0 , 0-->1)
            }
            System.out.println();

        }
    }
}
