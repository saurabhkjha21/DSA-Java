package Recursion;

public class FunctionCalls {
    public static void apple(){
        System.out.println("Hi, I'm in apple");
    }
    public static void main(String[] args){
        System.out.println("I'm main method");
        apple();
    }
}
