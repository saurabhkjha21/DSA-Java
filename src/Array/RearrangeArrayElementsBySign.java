package Array;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int n=arr.length;
        int[] res  = bruteForce(arr, n);
        System.out.println(Arrays.toString(res)+" ");
        int[] ans = optimizeApproach(arr, n);
        System.out.println("Optimize Approach : "+Arrays.toString(ans));
    }
    public static int[] bruteForce(int[] arr, int n){
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int p=0, ng=0;
        for(int i=0; i<n; i++){
            if(arr[i]>0) pos[p++]=arr[i];
            else neg[ng++]=arr[i];
        }
        int[] res = new int[n];
        int i=0;
        for(int k=0; k<n/2; k++){
            res[i++]=pos[k];
            res[i++]=neg[k];
        }
        return res;

    }
    public static int[] optimizeApproach(int[] arr, int n){

        int[] res=new int[n];
        int pos=0, neg=1;

        for(int i=0; i<n; i++){
            if(arr[i]>0){
                res[pos]=arr[i];
                pos+=2;
            }else{
                res[neg]=arr[i];
                neg+=2;
            }
        }
        return res;
    }
}
