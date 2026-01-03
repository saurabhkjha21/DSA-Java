package HashMapsAndHashSets;

import java.util.HashSet;

public class iterateSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        for (int ele : set){
            System.out.print(ele+" ");
        }
        HashSet<Integer> st = new HashSet<>();
        int[] arr = {2,4,5,6,7,8,9,10,11};
        for(int ele : arr){
            System.out.println(ele+" ");
        }
        System.out.println();
    }
}
