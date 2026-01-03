package Array;

import java.util.Scanner;

public class RevByKPractice {
    public static void reverse(int[] arr, int i, int j){
        while(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
        }
    }
    public static void rotateByK(int[] arr, int k){
        int n=arr.length;
        k=k%n;

//        reverse(arr,n-k,n-1);//rotate right
//        reverse(arr,0,n-k-1);
        reverse(arr,0,k-1); //rotate left
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);


    }
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,77,88,99};
        for(int ele:arr) System.out.print(ele+" ");
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter K: ");
        int k = sc.nextInt();

        rotateByK(arr,k);
        for(int ele:arr) System.out.print(ele+" ");


    }
}
