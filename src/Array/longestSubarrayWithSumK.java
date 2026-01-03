package Array;

import java.util.Scanner;

public class longestSubarrayWithSumK {
    //BF Approach TC=O(n^2)*m
    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int len =0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int m = i; m <= j; m++) {
                    sum += arr[m];
                }
//                int len = 0;
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return  len;
    }
    //Better Approach TC=O(n^2)
    public static int smallestSubArraysWithSumK(int[] arr, int k){
        int n = arr.length; int len = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=arr[j];
                if(sum==k){
                    len=Math.max(len, j-i+1);
                }
            }

        }
        return len;
    }

    //Two-Pointer
    public static int smallestSubArraysWithSumKTwoPointer(int[] arr, int k){
        int right=0, left=0, maxLen=0, sum=0;
        int n = arr.length;
        while(right<n){
            sum+=arr[right];

            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,6,1,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        System.out.println(longestSubarray(arr,k));
        System.out.println(smallestSubArraysWithSumK(arr,k));
        System.out.println(smallestSubArraysWithSumKTwoPointer(arr,k));

    }
}
