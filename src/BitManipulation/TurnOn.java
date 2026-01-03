package BitManipulation;

public class TurnOn {
    public static void main(String[] args) {
        int a =0b10111000011;
        int k=5;
        int mask=1<<k;
        System.out.println("Mask: "+mask);
        int result1=a|mask;  //turn On
        int result2=a & (~mask); //turn off

        System.out.println("Original: "+Integer.toBinaryString(a));
        System.out.println("After On: "+Integer.toBinaryString(result1));
        System.out.println("After Off: "+Integer.toBinaryString(result2));

        //Toggle
        int toggle=a^mask;
        System.out.println("Toggle: "+toggle);

    }
}
