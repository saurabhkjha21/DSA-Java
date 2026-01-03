package Array_2D_MD;

public class MaxElement_M2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int n= arr.length;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for (int j = 0; j < arr[0].length; j++) {
                max=Math.max(max,arr[i][j]);
            }
        }
        System.out.println(max);
    }
}
