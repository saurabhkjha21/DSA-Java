package ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
        try
        {
            int a = 10, b=2, c=a/b;
            System.out.println(c);

            int[] arr = {1,2,3,4,5};
            System.out.println(arr[4]);

            String s = "null";
            System.out.println(s.toUpperCase());

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        /*catch (ArithmeticException ae)
        {
            System.out.println(ae);
            System.out.println("Arithmetic Exception");

        }
        catch (ArrayIndexOutOfBoundsException aiobe)
        {
            System.out.println(aiobe);
            System.out.println("Array Exception");
        }
        catch (NullPointerException npe) {
            System.out.println(npe);
            System.out.println("Number Exception");
        }*/

    }
}
