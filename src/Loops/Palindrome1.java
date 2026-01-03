package Loops;
import  java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String Str = str.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome=true;
        int length=Str.length();

        for(int i=0; i<length/2; i++){
            if(str.charAt(i) != str.charAt(length - i -1)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome) System.out.print("\""+str+"\"is a Palindrome.");
        else  System.out.print("\""+str+"\"is not a Palindrome.");

    }
}
