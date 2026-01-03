package Array;

import java.util.Arrays;

public class SortZeroesM2 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,0,1,1,1,0};
        int n= arr.length;
        int countZeroes=0;
        for(int i=0; i<n; i++) {
            if(arr[i]==0){
                countZeroes+=1;
            }
        }
        int countOnes=n-countZeroes;
        for(int i=0; i<countZeroes;i++){
            arr[i]=0;
        }
        for(int i=countZeroes; i<n; i++){
            arr[i]=1;
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}
