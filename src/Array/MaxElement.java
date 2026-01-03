package Array;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {10,24,45,98,89,0,45};
        int n = arr.length;
        int max=arr[0];
        for(int i=0; i<n; i++ ){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        System.out.print(max+" ");
    }
}
