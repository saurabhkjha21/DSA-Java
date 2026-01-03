package Practice;
import java.util.*;

public class containPalindrome {
    private static boolean palindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = sc.nextLine();
        int n = input.length();
        int score = 0;

        for(int i=0; i<n; i++){
            StringBuilder temp = new StringBuilder();
            for (int j = i; j < n; j++) {
                temp.append(input.charAt(j));
                int len = temp.length();

                if(palindrome(temp.toString()) && len==4){
                    score+=5;
                }
                if(palindrome(temp.toString()) && len==5){
                    score+=10;
                }
            }
        }
        System.out.println("Score: "+score);

    }
}
