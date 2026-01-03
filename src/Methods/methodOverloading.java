package Methods;

public class methodOverloading {
    public static int mul(int x, int y){
        return x*y;
    }
    public static int mul(int x, int y, int z){
        return x*y*z;
    }

    public static void main(String[] args) {
        System.out.println(mul(1,2));
        System.out.println(mul(1,2,3));
    }
}
