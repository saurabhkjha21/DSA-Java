import java.util.Arrays;

public class AlternateNumbers {
    public static void main(String[] args) {
        int[] arr = {9, 0,-1,-2,-5,6, 8,-4, 5};
        int n=arr.length;
        rearrange(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    public static void rearrange(int[] arr, int n){
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p=0, ng=0;
        for(int i=0; i<n; i++){
            if(arr[i]>=0) pos[p++]=arr[i];
            else neg[ng++]=arr[i];
        }

        int i=0, pi=0, ni=0;
        while(pi<p && ni<ng){
            arr[i++]=pos[pi++];
            arr[i++]=neg[ni++];
        }

        while(pi<p){
            arr[i++]=pos[pi++];
        }

        while(ni<ng){
            arr[i++]=neg[ni++];
        }

    }
}
