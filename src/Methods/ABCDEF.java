package Methods;

class Calculator4
{
    int res;
    int add(int x, int y){
        res = x+y;
        return res;
    }
}

public class ABCDEF {
    public static void main(String[] args) {
        Calculator4 calc = new Calculator4();
        int a =10;
        int b =30;
        int sum=calc.add(a,b);
        System.out.println(sum);
    }
}
