package String;

public class stringBuilderFunctions {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("saurabh");
        StringBuilder ab= new StringBuilder("gaurabh");
        System.out.println(sb.compareTo(ab));
        System.out.println(sb.toString().compareTo(ab.toString()));
        System.out.println(sb.reverse());
    }
}
