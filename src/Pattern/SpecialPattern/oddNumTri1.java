package Pattern.SpecialPattern;

import java.util.Scanner;

public class oddNumTri1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter no. ");
//        int n = sc.nextInt();
//        for (int i =1; i<=n; i++){ //rows
//            for (int j =1; j<=2*i-1 ; j+=2){ //cols
//                System.out.print(j +" ");
//            }
//            System.out.println();
//        }
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. ");
    int n = sc.nextInt();
    for (int i =1; i<=n; i++){ //rows
        int a=1;
        for (int j =1; j<=i ; j++){ //cols
            System.out.print(a + " ");
            a+=3;
        }
        System.out.println();
    }
}
}
