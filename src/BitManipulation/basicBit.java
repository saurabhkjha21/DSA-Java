package BitManipulation;

public class basicBit {
    public static void main(String[] args) {
        System.out.println(5|9);
        System.out.println();
        System.out.println(5&9);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //Associative
        System.out.println(4|5|6);
        System.out.println(5|6|4);
        System.out.println();

        //One's Compliment
        System.out.println(~6); //output=-7
        System.out.println();
        //2's Compliment
        System.out.println();
    }
}
