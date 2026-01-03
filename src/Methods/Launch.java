package Methods;

class Calculator1 {
    int a;
    int b;
    int res;

    void add(){
        a =10;
        b =20;
        res = a+b;
        System.out.println(res);


    }
}
class Launch{
    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        calc.add();
    }
}