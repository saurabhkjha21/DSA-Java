package ArrayList;

import java.util.ArrayList;

public class FindUnionTP {
    static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int m, int n){
//        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();
        int i = 0, j=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
                }else if(arr1[i]>arr2[j]) {
                    if(Union.size()==0 || Union.get(Union.size()-1)!=arr2[j])
                    Union.add(arr2[j]);
                    j++;
                }else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
                j++;
                }
            }
            while(i<m){
                if(Union.get(Union.size()-1)!=arr1[i]) {
                    Union.add(arr1[i]);
                    i++;
                }
            }
            while(j<n){
                if(Union.get(Union.size()-1)!=arr2[j]) {
                    Union.add(arr2[j]);
                    j++;
                }
            }
            return Union;
        }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,11};
        int m = arr1.length;
        int[] arr2 = {8,9,10,11,12};
        int n = arr2.length;
        ArrayList<Integer> Union = FindUnion(arr1, arr2, m, n);
        for(int ele:Union){
            System.out.print(ele+" ");
        }
    }
}
