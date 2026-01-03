package Array;

public class RevArrTP {
    public static void Reverse(int[] arr){
        int i=0;
        int n=arr.length;
        int j=n-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println();
        Reverse(arr);
    }
}
