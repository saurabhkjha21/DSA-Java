package OOPs.Inheritence;


public class SingleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();

    }
}
class Parent{
    int x=10;
}
class  Child extends Parent{ //inheritance added
    int x=20;
    void show(){
        System.out.println(x); //child's x
        System.out.println(super.x); //parent's x
    }

}
