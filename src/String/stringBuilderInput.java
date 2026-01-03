package String;

import java.util.Scanner;

public class stringBuilderInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s= sc.nextLine();
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(1,'s');
        System.out.println(sb);

    }
}
