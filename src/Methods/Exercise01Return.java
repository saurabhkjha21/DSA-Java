package Methods;

public class Exercise01Return {
        public static String Name(String name){
            return name;
        }
        public static int Age(int age){
            return age;
        }

        public static void main(String[] args) {
            String  name = Name("Rakesh");
            int age = Age(50);
            System.out.println("Name: "+name);

            System.out.println("Age: "+age);

        }
}
