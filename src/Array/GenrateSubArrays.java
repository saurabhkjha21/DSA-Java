package Array;

public class GenrateSubArrays {
    public static void printSubArrays(int [] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("[");
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]");
                System.out.println();

            }
        }
    }
    public static int printMinimumSum(int [] arr){
        int n = arr.length;
        int sum=0;
        for(int i=0; i<n; i++){
            int min = arr[i]; //first element
            for(int j=i; j<n; j++){
                min= Math.min(min, arr[j]); //update min and add to sum
                sum+=min;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        printSubArrays(arr);
        System.out.println(printMinimumSum(arr));
    }
}
