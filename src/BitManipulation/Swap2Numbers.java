package BitManipulation;

public class Swap2Numbers {
    public static void main(String[] args) {
        int a=5, b=6;
        System.out.println(a+" "+b);
        //without using 3rd variable(+ and -)
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);

        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println(a+" "+b);
        //Associative
        System.out.println(a^a);
        System.out.println(b^0);

    }
}
