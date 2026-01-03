package Array;

import java.util.Scanner;

public class RVPart {
    public static void ReversePart(int[] arr){
        int i=0;
        int j=5;
        int n=arr.length;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele: arr) System.out.print(ele+" ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        for(int ele: arr) System.out.print(ele+" ");
        System.out.println();
        ReversePart(arr);
    }

}
