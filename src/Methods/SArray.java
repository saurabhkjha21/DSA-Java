package Methods;

public class SArray {
    public static int sumArray(int[] numbers){
        int sum = 0;
        for(int num:numbers){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,40,50,};
        int totalSum=sumArray(arr);
        System.out.println(totalSum);
    }
}
