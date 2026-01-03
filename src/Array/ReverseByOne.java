package Array;

public class ReverseByOne {
    public static void reverseByOne(int[] arr){
        int n= arr.length;
        int last=arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;

    }
    public static void reverseByOneLeft(int[] arr){
        int n= arr.length;
        int first=arr[0];
        for(int i=0; i<n-1; i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=first;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        reverseByOne(arr);
        System.out.println("Reversed");
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println("Reverse left");
        reverseByOneLeft(arr);
        System.out.println("LEft");
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }
}
