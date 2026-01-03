package HashMapsAndHashSets;

import java.util.HashSet;

public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //set stores in unordered manner
        //insert T.C=O(1)
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(0);
        set.add(-1);
        set.add(5);
        System.out.println(set);
        //search-true/false
        //T.C=O(1)
        System.out.println(set.contains(100));
        System.out.println(set.contains(5));
        System.out.println("Size is :"+set.size());
        set.remove(-1);
        System.out.print(set);

        Object[] arr = set.toArray();
        for(int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
