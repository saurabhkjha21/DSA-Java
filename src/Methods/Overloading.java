package Methods;



public class Overloading {
    public static void SayHi(){
        System.out.println("Hi");
    }
    public static void SayHi(String name){
        System.out.println("Hi "+name);
    }
    public static void main(String[] args) {
        SayHi();
        SayHi("Neso");
    }

}
