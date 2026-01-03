package Array;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,-1,-1,0,7,3,-2,9,0,5};
        int n=arr.length;
        int result = bruteForce(arr, n);
        System.out.println("BruteForce Approach: "+result); //T.C=~O(n^3)
        betterForce(arr, n);
        result = OptimalApproach(arr, n);
        System.out.println("Optimal Approach: "+result); //T.C=~O(n^3)
        result = kadane(arr);
        System.out.println("Kadane Approach: "+result); //T.C=~O(n^3)
        OptimalApproach1(arr, n);

    }

    public static int bruteForce(int[] arr, int n){
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                    maxSum=Math.max(sum, maxSum);
                }
            }
        }
        return maxSum;
    }
    public static void betterForce(int[] arr, int n){
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=arr[j];
                maxSum=Math.max(sum, maxSum);
            }
        }
        System.out.println("Better  Approach: "+maxSum);
    }
    public static int OptimalApproach(int[] arr, int n){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            maxSum=Math.max(maxSum, sum);
            if(sum<0){
                sum=0;
            }

        }

        return maxSum;
    }
    public static void OptimalApproach1(int[] arr, int n){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;

        int start=0;
        int ansStart=0;
        int ansEnd=0;

        for(int i=0; i<n; i++){
            if(sum==0) start=i;

            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
                ansStart=start;
                ansEnd=i;
            }

            if(sum<0){
                sum=0;
            }
        }
        System.out.println("Maximum sum= "+maxSum);
        System.out.println("Subarray = ");
        for(int i=ansStart; i<=ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int kadane(int[] arr){
        int maxSum = arr[0];
        int currSum = arr[0];

        for(int i = 1; i < arr.length; i++){
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

}
