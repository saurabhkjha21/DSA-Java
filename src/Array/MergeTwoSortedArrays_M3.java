package Array;

public class MergeTwoSortedArrays_M3 {
    public static void main(String[] args) {
        int[] a ={11, 33, 42, 71};
        int m=a.length;
        int[] b ={26, 54, 69, 81};
        int n=b.length;
        int[] c =new int[m+n];
        int i=m-1, j=n-1, k=m+n-1;
        while((i >= 0) && (j >= 0)){
            if(a[i]>b[j]){
                c[k]=a[i];
                i--;
            }
            else{
                c[k]=b[j];
                j--;
            }
            k--;
        }
        while(i>=0){
            c[k]=a[i];
            i--;
            k--;
        }
        while(j>0){
            c[k]=b[j];
            j--;
            k--;

        }
        for(int ele:c) System.out.print(ele+" ");
    }
}
