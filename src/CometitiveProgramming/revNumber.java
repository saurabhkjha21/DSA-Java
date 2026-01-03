package CometitiveProgramming;

import java.util.Scanner;

public class revNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the Element: ");{
            for(int i =0 ; i<n; i++){
                arr[i] = sc.nextInt();
            }
        }
        System.out.print("Elements In Rev Order: " );
        for(int i =n-1; i>=0; i--){
            System.out.println(arr[i]+ " ");
        }
    }
}
