package Methods;

public class Exercise001 {

        public static void Name(String name){
            System.out.println("Name: "+name);
        }
        public static void Age(int age){
            System.out.println("Age: "+age);
        }

        public static void main(String[] args) {
            String name = "Rakesh";
            int age =50;
            Name(name);
            Age(age);
        }

}
