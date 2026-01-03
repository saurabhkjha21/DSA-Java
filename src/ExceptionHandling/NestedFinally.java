package ExceptionHandling;

public class NestedFinally {
    public static void main(String[] args) {
        try
        {
            String a = " sau ";
            System.out.println(a.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                System.out.println(10/2);
            }
            catch(ArithmeticException a)
            {
                System.out.println(a);
            }
            finally {
                System.out.println("Ended");
            }

        }
        System.out.println("End");
    }
}
