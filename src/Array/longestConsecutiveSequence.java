package Array;
import java.util.*;
public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 102, 100, 101, 101, 4, 3, 2, 3, 2, 1, 1, 1, 2};
        int n = arr.length;
        int result = bfApproach(arr, n);
        System.out.println(result);
        int ans = optimalApproach(arr, n);
        System.out.println(ans);
    }
    public static int bfApproach(int[] arr, int n){
        if(n==0) return 0;
        Arrays.sort(arr);
        int cnt=1; int res=1;

        for(int i=1; i<n; i++){
            //skip duplicate
            if(arr[i] == arr[i-1]) continue;

            //current element is consecutive to previous element
            if(arr[i]==arr[i-1]+1){
                cnt++;
            }else{
                //if not start new sequence
                cnt=1;
            }
            res=Math.max(res, cnt);
        }
        return res;
        /* T.C = O(n*logn) */
    }
    public static int optimalApproach(int[] arr, int n){
        if(n==0) return 0;

        Set<Integer> set = new HashSet<>();

        for(int ele : arr){
            set.add(ele);
        }

        int longest=1;
        for(int num : set){
            if(!set.contains(num-1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
