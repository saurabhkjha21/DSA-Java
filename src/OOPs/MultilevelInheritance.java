package OOPs;
class Animal{
    void eat(){
        System.out.println("Animal is eating.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking.");
    }
}
class Puppy extends Dog{
    void run(){
        System.out.println("puppy is running.");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.run();
        p.eat();
        p.bark();
    }
}
