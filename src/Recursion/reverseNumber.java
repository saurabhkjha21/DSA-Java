package Recursion;

public class reverseNumber {
    public static void reversePrint(int n, int rev){
        if(n==0){
            System.out.println(rev);
            return;
        }
        reversePrint(n/10, rev*10+(n%10));

    }
    public static int reverseInt(int n, int rev){
        if(n==0) return rev;
        return reverseInt(n/10, rev*10+(n%10));

    }
    public static void main(String[] args) {
        int n =1234;
        reversePrint(n, 0);
        System.out.println("--"+reverseInt(n,0));
    }
}
