package Array;

import java.util.Scanner;

public class RevPartUserInput {
    public static void ReversePart(int[] arr,int i, int j){

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

        System.out.print("Enter i=0: ");
        int i=sc.nextInt();
        System.out.print("Enter j: ");
        int j=sc.nextInt();
        ReversePart(arr,i,j);



    }
}
