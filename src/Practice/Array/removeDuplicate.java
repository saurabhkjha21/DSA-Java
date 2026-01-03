package Practice.Array;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,1,4,1};
//        int n=arr.length;
//        for(int i=0; i<n; i++){
//            for(int j=i+1; j<n; j++){
//                if(arr[i]==arr[j]) {
//                    for (int k = j; k < n - 1; k++) {
//                        arr[k] = arr[k + 1];
//                    }
//                    n--;
//                    j--;
//                }
//            }
//        }
//        for (int i=0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }
        System.out.println();
        int[] nums = {1,2,4,5,6,2,4};
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])) set.add(nums[i]);
        }
        System.out.println(set);


    }
}
