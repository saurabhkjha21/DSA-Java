package Array;

import java.util.Scanner;

public class RotateByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {11,12,13,14,15,16,17,18};
        int n = arr.length;

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] res=new int[n];

        k=k%n; //k>n
        for(int i=0; i<k; i++){
            res[i]=arr[n-k+i]; //copy k elements to res
        }

        for(int i =k; i<n; i++){
            res[i]=arr[i-k];  //copy n - k elements
        }

        System.out.print("Rotated Array: ");
        for(int num: res){
            System.out.print(num+" ");
        }



        }
    }

