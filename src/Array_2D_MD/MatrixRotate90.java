package Array_2D_MD;

public class MatrixRotate90 {
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3,},{4,5,6},{7,8,9}};
        int rows=arr.length;
        int cols=arr[0].length;
        System.out.println("Original Matrix: ");
        printMatrix(arr);
        System.out.println("Transpose Matrix: ");
        for(int i=0; i<rows; i++){
            for (int j = i+1; j < cols; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printMatrix(arr);
        System.out.println("Rotated Array: ");
        for(int i=0; i<rows; i++) {
          int start=0, end=cols-1;
          while(start<end){
              int temp=arr[i][start];
              arr[i][start]=arr[i][end];
              arr[i][end]=temp;
              start++;
              end--;
          }
        }
        printMatrix(arr);
    }
}
