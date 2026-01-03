package SearchingAndSorting;

import java.util.Scanner;
import java.util.*;
public class linearSearch {
    public static int linearSearch(int[] arr, int target){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==(target)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {8,4,6,2,55,34,990, 6,2};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(linearSearch(arr,target));
    }
}
