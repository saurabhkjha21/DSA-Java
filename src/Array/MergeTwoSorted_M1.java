package Array;

public class MergeTwoSorted_M1 {
    public static void main(String[] args) {
        int[] a ={11, 33, 42, 71, 88};
        int m=a.length;
        int[] b ={26, 54, 69, 81,82,89,99};
        int n=b.length;
        int[] c =new int[m+n];
        int p = c.length;
        // merging array a and b into c
        for(int i =0; i<m; i++){
            c[i]=a[i];
        }
        for(int i =0; i<n; i++){
            c[m+i]=b[i];
        }
        //Sorting
        for(int i =0; i<p; i++){
            for(int j=0; j<p-1-i; j++){
                if(c[j]>c[j+1]){
                    int temp=c[j+1];
                    c[j+1]=c[j];
                    c[j]=temp;
                }
            }
        }
        for(int ele:c) System.out.print(ele+" ");
    }
}
