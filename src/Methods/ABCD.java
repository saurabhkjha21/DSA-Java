package Methods;

class Calculator2 {
    int a;
    int b;
    int res;

    int mul()
    {
        a = 5;
        b = 4;
        res = a*b;
        return res;

    }
}

public class ABCD {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        int result = calc.mul();
        System.out.println(result);

    }
}
