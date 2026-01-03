package ExceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        try
        {
            try
            {
                int a[]={10,20,30};
                System.out.println(a[2]);
            }
            catch(ArrayIndexOutOfBoundsException a)
            {
                System.out.println(a);
                System.out.println("Out of Limit");
            }
            System.out.println(10/0);
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
        System.out.println("Lal");
    }
}


