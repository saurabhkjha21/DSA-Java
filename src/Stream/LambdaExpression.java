package Stream;


public class LambdaExpression {
    public static void main(String[] args){
        MathOperation sumOperation=(a,b) -> a + b;
        int res = sumOperation.operate(1,2);
        System.out.println(res);
    }

}
interface MathOperation{
    int operate(int a, int b);
}