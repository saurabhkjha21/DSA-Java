package Methods;

public class passingArgumentsByValue {

    public static void increment(int x){
        x++;
        System.out.println(x);
//        return x;
    }

    public static void main(String[] args) {
        int x = 1;
        increment(x);
        System.out.println(x);
    }
}
