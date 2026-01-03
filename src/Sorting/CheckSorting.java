package Sorting;

public class CheckSorting {

        public static void main(String[] args) {
            int[] arr = {1, 4,  7, 90, 100};
            int n = arr.length;
            boolean flag=true; // True means Sorted
            for (int i = 0; i < n-1; i++) {
                if (arr[i]>arr[i+1]){
                    flag = false; // false means unsorted
                    break;
                }
            }
            if(flag == true) System.out.println("Sorted");
            else System.out.println("unsorted");
        }


}
