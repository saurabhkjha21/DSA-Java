package Array;
import java.util.ArrayList;
import java.util.HashMap;

public class unionOfArray {
    static  ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer> Union = new ArrayList<>();
        HashMap<Integer, Integer> frq = new HashMap<>();

        for(int i=0; i<n; i++){
            frq.put(arr1[i], frq.getOrDefault(arr1[i],0)+1);
        }
        for(int num : arr2){
            frq.put(num, frq.getOrDefault(num,0)+1);
        }
        for(int it : frq.keySet()){
            Union.add(it);
        }
        return Union;
    }
    public static void main(String[] args) {
        int[] arr1 = {4,5,1,2,3,5,2,1};
        int[] arr2 = {3,7,2,4,6,2,3,3,2};
        int n= arr1.length;
        int m = arr2.length;
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        for(int val:Union){
            System.out.print(val+" ");
        }

    }
}
