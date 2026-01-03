package String;

public class StringBuilderJava {
    public static void main(String[] args) {
        String s=new String("Saurabh");
        StringBuilder sb = new StringBuilder("Saurabh");
        System.out.println(sb);
        System.out.println(s);
        StringBuilder x = new StringBuilder("");
        System.out.println(x.length());
        System.out.println(x.capacity()); //by default capacity for empty string is 16
        StringBuilder a = new StringBuilder(10);
        System.out.println(a.capacity());

    }
}
