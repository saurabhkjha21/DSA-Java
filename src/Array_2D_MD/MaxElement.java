package Array_2D_MD;

public class MaxElement {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8}};
        int n= arr.length;

        int max=arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }

        }
        System.out.print("Maximum element: "+max);
    }
}
