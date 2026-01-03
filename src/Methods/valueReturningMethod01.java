package Methods;

public class valueReturningMethod01 {
    public static int tryMethod(int x, int y){
        int sum = x+y;
        return sum;
    }
//    public static int tryMethod(int x, int y){
//        return x+y;
//    }

    public static void main(String[] args) {

        System.out.print("The Sum is: "+tryMethod(1,2));


    }
}
