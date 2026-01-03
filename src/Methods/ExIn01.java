package Methods;
import java.util.Scanner;

public class ExIn01 {
    public static void main(String[] args) {
        System.out.print("Enter Your Name And Age: ");
        System.out.println(getName());
       // System.out.println("Enter Your Age: ");
        System.out.println(getAge());
    }
    public static String getName(){
        //Scanner input = new Scanner(System.in);
        //String name = input.nextLine();
        return new Scanner(System.in).nextLine();
    }
    public static double getAge(){
        return new Scanner(System.in).nextDouble();
    }
}
