package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class FindUnion {
    static ArrayList<Integer>  FindUnion(int[] arr1, int[] arr2, int m, int n){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();

        for(int i=0; i<m;i++)
            set.add(arr1[i]);
        for(int i=0; i<n;i++)
            set.add(arr2[i]);
        for(int ele:set)
            Union.add(ele);

        return Union;

    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2,3,4,4,5,6,11};
        int m=arr1.length;
        int n=arr2.length;
        ArrayList<Integer> Union = FindUnion(arr1, arr2,m, n);
        for(int val:Union){
            System.out.print(val+" ");
        }
    }
}
