package Recursion;

public class PalindromeNumber {

    public static boolean isPalindrome(int n , int original, int reverse){
        if(n==0) return original==reverse;
        int digit = n%10;
        reverse=reverse*10+digit;
        return isPalindrome(n/10, original, reverse);
    }
    public static void main(String[] args) {
        int n = 133321;
        System.out.println(isPalindrome(n, n,0));
    }
}
