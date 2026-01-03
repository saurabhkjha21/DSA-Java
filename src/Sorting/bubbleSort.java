package Sorting;

public class bubbleSort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 8, 1,-3,4,2, 10};
        int n = arr.length;
        print(arr);
        // Bubble sort
        for(int j =1; j<=n-1; j++ ){ //n-1 passes
            for(int i = 0; i<n-1; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                }
            }
        }
        print(arr);

    }
}
