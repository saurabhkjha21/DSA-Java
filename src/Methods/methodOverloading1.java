package Methods;

public class methodOverloading1 {
    public static void sum(int x, int y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        int a = 3, b = 5;
        sum(a,b);
    }
}
