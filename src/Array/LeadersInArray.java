package Array;

import java.util.ArrayList;
import java.util.*;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {0, 12, 4, 4, 5, 6,15, 3, 6};
        int n = arr.length;
        int[] res = BF(arr,n);
        System.out.println("BF Approach: "+ Arrays.toString(res));
        optimal(arr, n);

    }
    public static int[] BF(int[] arr, int n){

        List<Integer> leaders = new ArrayList<>();
        for(int i=0; i<n; i++){
            boolean leader=true;
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader){
                leaders.add(arr[i]);
            }
        }
        int[] res = new int[leaders.size()];
        for(int i=0; i<leaders.size(); i++){
            res[i]=leaders.get(i);
        }
        return res;
    }
    public static void optimal(int[] arr, int n){

        int max=Integer.MIN_VALUE;
        List<Integer> leader = new ArrayList<>();
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>max){
                max=arr[i];
                leader.add(arr[i]);
            }

        }
        Collections.reverse(leader);
        System.out.println("Optimal Approach: "+leader);

    }

}
