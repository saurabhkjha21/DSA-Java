package Array;

public class NextPermutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        nextPermutations(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void nextPermutations(int[] arr){
        int i = arr.length-2;
        //Find the largest index such arr[i]<arr[i+1]
        while(i>=0  && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            //Find the next largest index j such that arr[i]<arr[j]
            int j = arr.length-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            //swap
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //
        reverseArray(arr,i+1, arr.length-1);
    }
    public static void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start ++;
            end--;
        }
    }
}
