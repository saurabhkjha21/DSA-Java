package Array;

public class RAWEA {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int n=arr.length;
        for(int i=0; i<n/2; i++){
//            int j=n-i-1;
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}
