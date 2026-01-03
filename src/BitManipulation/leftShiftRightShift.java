package BitManipulation;

public class leftShiftRightShift {
    public static void main(String[] args) {
        //right shift
        System.out.println(91>>2); //22
        System.out.println(91>>3);//11

        //left shift
        System.out.println(91<<2);//364
        System.out.println(91<<3);
        byte x=0b01100110; //0b or 0B tells java that the no. is binary
        int shifted=x<<3;
        System.out.println(shifted);
        System.out.println();

        //Power of 2^n
        System.out.println(1<<2);
        System.out.println(1<<3);
        System.out.println(1<<5);

    }
}
