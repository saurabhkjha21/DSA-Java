package Array_2D_MD;

public class TransposeStor {
    public static void main(String[] args) {
        int[][] a ={{1,2,3},{4,5,6},{7,8,9}};
        int rows=a.length;
        int cols=a[0].length;

        System.out.println("Transpose Matrix:");
        int[][] trans=new int[cols][rows];
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                trans[i][j]=a[j][i];
            }
            System.out.println();
        }
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
