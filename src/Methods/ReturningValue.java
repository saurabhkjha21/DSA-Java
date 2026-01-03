package Methods;

public class ReturningValue {
    public static float Average(float x, float y){
        return (x+y)/2f;
    }
    public static void Hi(){
        System.out.println("Say Hi");
        return;
    }

    public static void main(String[] args) {
        Hi();
        System.out.println("The Average is: ");
        float avg = Average(1,4);
        System.out.println(avg);
        System.out.println(Average(9,5) + Average(4,2));
        Hi();
    }
}
