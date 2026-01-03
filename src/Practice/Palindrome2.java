package Practice;

public class Palindrome2 {
    public static void main(String[] args) {
        String s = "level";
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        if(s.equals(s1.toString())){
            System.out.println(s+" is a palindrome");
        }
        else{
            System.out.println(s+" is not palindrome");
        }
    }
}

