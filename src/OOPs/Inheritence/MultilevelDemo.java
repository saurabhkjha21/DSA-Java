package OOPs.Inheritence;


public class MultilevelDemo {
    public static void main(String[] args) {
        Childs p = new Childs();
        p.eat();
        p.speak();
        p.run();
    }
}
class Grandparent{ //base class
    void eat(){
        System.out.println("Eating...");
    }
}
class Parents extends Grandparent{ //intermediate class
    void speak(){
        System.out.println("Speaking...");
    }
}
class Childs extends Parents{ //derived class
    void run(){
        System.out.println("Running...");
    }
}

