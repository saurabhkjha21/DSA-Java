package Array;

import java.util.Arrays;

public class SortZeroes {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,0,1,1,1,0};
        int n= arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
