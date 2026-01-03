package String;

import java.util.Locale;

public class indexOf {
    public static void main(String[] args) {
        String s="Saurabh Jha";
        System.out.println(s.indexOf('b'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println();

        String a="abcd";
        String b="abc";
        System.out.println(a.compareTo(b));
        System.out.println();

        System.out.println(s.contains("rav"));
        System.out.println(s.startsWith("Sa"));
        System.out.println(s.toLowerCase());
        s=s.toUpperCase();
        System.out.println(s);
        s=s.toLowerCase();
        System.out.println(s);

        String l="lmn";
        String x="xyz";
        System.out.println(l.concat(x));

        String c="";//null
        System.out.println(c.length());
        System.out.println();


        System.out.println(s.substring(2));
        System.out.println(s.substring(1,4));
        System.out.println(s.substring(2,2));
        System.out.println(s.substring(1,11));


    }
}
