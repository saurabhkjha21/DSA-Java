package PracticeArrays;
import java.util.*;
public class ReaverseArray {
    public static int[] reverse(int[] arr){
//        int n= arr.length;
        int start=0, end=arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int[] res=reverse(arr);
        System.out.println(Arrays.toString(res));

    }
}
