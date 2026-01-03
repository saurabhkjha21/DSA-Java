package OOPs;


class Animal1{
    void eat(){
        System.out.println("Animal is eating.");
    }
}
class Dog1 extends Animal1{
    void bark(){
        System.out.println("Dog is barking.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
