package HashMapsAndHashSets;

import java.util.HashSet;

public class LC2442 {
    private static int countDistinct(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
            set.add(reverse(arr[i]));
        }
        return set.size();
    }
    public static int reverse(int n){
        int rev =0;
        while(n>0){
            int ld = n%10; //get last digit
            rev=rev*10 + ld; //build reverse
            n/=10; //to remove last digit
        }
        return rev;
    }

    public static void main(String[] args) {
        int[] arr= {1,10,12,13,32,42,24};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("Distinct Count: "+countDistinct(arr));
    }
}
