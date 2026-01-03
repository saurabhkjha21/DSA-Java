package Array;

public class MergeTwoSortedArrays_M2 {
    public static void main(String[] args) {
        int[] a ={11, 33, 42, 71};
        int m=a.length;
        int[] b ={26, 54, 69, 81};
        int n=b.length;
        int[] c =new int[m+n];
//        int p= c.length;
        int i = 0, j=0, k=   0;

        while(i<m && j<n){
            if(a[i] <= b[j]){
                c[k]=a[i];
                i++;
            } else  {
                c[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<m){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<n){
            c[k]=b[j];
            j++;
            k++;
        }
//
        for(int ele:c) System.out.print(ele+" ");
    }
}
