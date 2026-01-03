package CometitiveProgramming;

import java.util.Scanner;

public class BinarySearch {

    public static int binSearch(int[] arr, int n, int key){
        int low = 0; int high =n - 1;
        while(low<=high){
            int mid = (high+low)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key)  low = mid+1;
            else  high = mid-1;
        }
        return -1;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 12, 23, 24, 34, 45, 56};
        int n = arr.length;
        System.out.println("The Size Of Array : " + n);
        System.out.println("Enter Key: ");
        int key = sc.nextInt();
        int res = binSearch(arr,n,key);

        if(res==-1) System.out.println("Element Not Found!");
        else System.out.println("Element Found At Index %d");

    }
}
