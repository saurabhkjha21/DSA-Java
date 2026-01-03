package String;

import java.util.Scanner;

public class toggleInputChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = sc.nextLine();
        StringBuilder sb= new StringBuilder(s);

        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii>='A' && ascii <= 'Z') { //65-90
                ascii+=32; // +32/-32 is dist btw A(65) and a(97)
                ch = (char)ascii;
                sb.setCharAt(i,ch);
            } else if (ascii>='a' && ascii<='z') { //97-122
                ascii-=32;
                ch = (char)ascii;
                sb.setCharAt(i,ch);
            }
        }
        System.out.println(sb);
    }

}
