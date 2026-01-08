package OOPs.Inheritence;

public class Single {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.bark(); // own method
        d.eat();  // inherited method
        d.run();  // overridden method (Dog version)

        System.out.println(d.legs);        // Dog variable
        System.out.println(((Animal)d).legs); // Parent variable
    }
}

class Animal {
    int legs = 4;

    void eat() {
        System.out.println("Animal is eating...");
    }

    void run() {
        System.out.println("Animal run...");
    }
}

class Dog extends Animal {
    int legs = 3; // variable hiding

    void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    void run() { // method overriding
        System.out.println("Dog run...");
    }
}
