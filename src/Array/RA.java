package Array;

public class RA {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        int[] rev = new int[n];

        for(int i=0; i<n; i++) rev[i]=arr[n-1-i];

        for(int i=0; i<n; i++) arr[i]=rev[i];

        for(int ele: arr) System.out.print(ele + " ");
    }
}
