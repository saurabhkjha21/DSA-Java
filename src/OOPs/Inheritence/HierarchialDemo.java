package OOPs.Inheritence;

public class HierarchialDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();//inherited
        c.drive();//own

        Bike b = new Bike();
        b.start();
        b.ride();
    }
}
class Vehicle{
    void start(){//common code
        System.out.println("Starting...");
    }
}
class Car extends Vehicle{
    void drive(){//specific code
        System.out.println("Driving...");
    }
}
class Bike extends Vehicle{
    void ride(){//specific code
        System.out.println("Riding...");
    }
}