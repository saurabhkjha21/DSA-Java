package ExceptionHandling;

public class TestThrow {
    void div(int a, int b)
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        else
        {
            int c = a/b;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        TestThrow tt = new TestThrow();
        tt.div(20,2);
    }
}
