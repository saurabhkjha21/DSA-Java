package Array_2D_MD;

public class WaveT2B {
    public static void print(int[][] arr){
        for(int[] row : arr){
            for (int val : row) {
                System.out.print(val+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println("Original: ");
        print(arr);
        System.out.println("Wave Form T 2 B: "  );
        int m=arr.length;
        int n=arr[0].length;
        for(int j=0; j<n; j++){
            if(j%2==0){
                for(int i=0; i<m; i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i=m-1; i>=0; i--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();

    }
}
