package BitManipulation;

public class TurnOffRightMost {
    public static void main(String[] args) {
        int a=43;
//        Method-1
        int b=a;
        int k=0;
        while((b&1)==0){ //b%2==0 also use this
            b=b>>1;
            k++;
        }
//       Method-1 System.out.println(a&~(1<<k));

        //Method-2
        int result=a&(a-1);
        System.out.println(result);
    }
}
