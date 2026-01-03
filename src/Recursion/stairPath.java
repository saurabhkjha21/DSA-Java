package Recursion;

import java.util.Scanner;

public class stairPath {
    public static int path(int n){
        if(n<=2) return n;
        return path(n-1) + path(n-2);
    }
    public static int path2(int n){
        if(n==0) return 1; //do nothing  --- valid path
        if(n<=0) return 0; //for base case if n =1,2 specially --- invalid path
        return path2(n-1) + path2(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(path2(n));
    }
}
