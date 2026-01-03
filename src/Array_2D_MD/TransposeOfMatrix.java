package Array_2D_MD;

import java.sql.SQLOutput;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] a ={{1,2,3},{4,5,6},{7,8,9}};
        int rows=a.length;
        int cols=a[0].length;
        System.out.println("Original Matrix: ");
        //Row-Wise Printing
        for(int i=0; i<rows; i++){
            for (int j = 0; j <cols; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:");
//        int[][] trans=new int[rows][cols];
        //Column-Wise Printing
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
