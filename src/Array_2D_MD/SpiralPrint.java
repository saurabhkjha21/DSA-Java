package Array_2D_MD;

public class SpiralPrint {
    public static void print(int[][] arr){
        for(int[] num: arr){
            for(int val:num){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        int m = arr.length;
        int n = arr[0].length;
        print(arr);

        int minr=0, maxr=m-1;
        int minc=0, maxc=n-1;

        while(minr<=maxr && minc<=maxc){
            //left to right
            for (int j = minc; j <=maxc; j++) {
                System.out.print(arr[minr][j]+" ");
            }
            minr++;
            //top to bottom
            if(minc>maxc || minr>maxr) break;
            for (int i = minr; i <= maxr ; i++) {
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;
            // right to left
            if(minc>maxc || minr>maxr) break;
            for (int j = maxc; j>=minc; j--) {
                System.out.print(arr[maxr][j]+" ");
            }
            maxr--;
            //bottom to top
            if(minc>maxc || minr>maxr) break;
            for (int i = maxr; i>=minr ; i--) {
                System.out.print(arr[i][minc]+" ");
            }
            minc++;
        }
    }
}
