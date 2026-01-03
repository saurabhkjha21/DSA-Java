package ExceptionHandling;

public class TCF { //Try-Catch Finally
    public static void main(String[] args) {
        try
        {
            System.out.println("Learn Baby.");
            int a = 20, b = 0, c = a/b;
            System.out.println(c);
            System.out.println("Dhoom");

        }
        catch(ArithmeticException n)
        {
            int x = 20, y = 0, z = x/y;
            //System.out.println(n);
            System.out.println(z);
            System.out.println("Can't divide by 0 ");
        }
        finally
        {
            /*int l = 20, m = 0, n = l/m;
            //System.out.println(n);
            System.out.println(n);*/
            System.out.println("Macha De");
        }
        System.out.println("Main Method Ended");
    }
}
