package Recursion;

public class stringPalindromeCheck {
    public static boolean palindromeCheck(String s, int start, int end ){
        int n=s.length();

        if(start>=end){
            return true;

        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return palindromeCheck(s, start+1, end-1);
    }
    public static void main(String[] args) {
        String s = "Madam";
        System.out.println(palindromeCheck(s, 0, s.length()-1));
    }
}
