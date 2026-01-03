package Methods;
class Calculator3
{
    int res;
    void add(int x, int y){
        res = x+y;
        System.out.println(res);
    }

}

public class ABCDE {
    public static void main(String[] args) {
        Calculator3 calc = new Calculator3();
        int a = 10;
        int b = 20;
        calc.add(a,b);
    }
}
