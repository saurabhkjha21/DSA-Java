package BasicToPlay;
import java.util.Arrays;
import java.util.Scanner;
public class RotateByOne {
    public static void main(String[] args){
        System.out.println("Enter array's size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        rotateBy1(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateBy1(int[] arr, int n){

        int last = arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        /* TC=O(n)
        SC=O(1)
         */
    }
}
