package Array_2D_MD;

public class WaveL2R {
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
        System.out.println("Wave Form R 2 L: "  );
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0; i<m; i++){
            if(i%2!=0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for (int j = n-1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.println("Wave Form L 2 R: "  );
        for(int i=0; i<m; i++){
            if(i%2==0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for (int j = n-1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }


    }
}
