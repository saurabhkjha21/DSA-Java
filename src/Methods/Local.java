package Methods;
class Calculator001{
    void add(int a, int b){
        int result = a+b;
        System.out.println("Sum: "+result);
    }
}

public class Local {
    public static void main(String[] args) {
        Calculator001 calc = new Calculator001();
        calc.add(10,89);
    }
}
