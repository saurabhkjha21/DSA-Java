package ExceptionHandling;

public class NFE {
    public static void main(String[] args) {
        String str ="Ram";
        try{
            int a = Integer.parseInt(str);
            System.out.println(a);
        }
        catch(NumberFormatException n){
            System.out.println(n);
            System.out.println("String "+str+" can't be converted to integer.");

        }
        System.out.println("Main Method Ended.");
    }
}
