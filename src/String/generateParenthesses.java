package String;

import java.util.Scanner;

public class generateParenthesses {
    public static void generateParenthesses(int open, int close, int n, String s){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) generateParenthesses(open+1, close, n, s+ "(");
        if(close<open) generateParenthesses(open, close+1, n, s+ ")");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateParenthesses(0, 0,n, "");
    }

}
