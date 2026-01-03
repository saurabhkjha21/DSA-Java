package Sorting;

import org.w3c.dom.ls.LSOutput;

public class inc_selectionSort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {21,-13,-11,8,6,5};
        int n = arr.length;
        print(arr);
        for(int i = 0; i<n; i++){
            int max = Integer.MIN_VALUE;
            int min_dx = -1;
            for(int j=i; j<n; j++){
                if(arr[j]<max){
                    max=arr[j];
                    min_dx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_dx];
            arr[min_dx]=temp;
        }
        print(arr);
    }


}
