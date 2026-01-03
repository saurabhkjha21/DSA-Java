package Loops;

public class oddNumberPrint {
    public static void main(String[] args) {

        for(int i =1; i<=100; i+=2){
            if(i%2==0) {
                continue;

            }
            System.out.print(i+ " ");

        }
        }
    }

