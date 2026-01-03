package String;
import java.util.*;
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
//        String sb = "Java";
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'L');
        System.out.println(sb);
        sb.insert(0,'S');
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        sb.append('i');
        sb.append('j');
        System.out.println(sb);
        System.out.println(sb.length());//length
    }
}
