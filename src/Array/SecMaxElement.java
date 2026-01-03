package Array;

public class SecMaxElement {
    public static void main(String[] args) {
        int[] arr= {11,23,32,13,65,77,90,1,0,99};
        int n=arr.length;
        int Max = Integer.MIN_VALUE;
        int SecMax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>Max){
                SecMax=Max;
                Max=arr[i];
            } else if (arr[i]>SecMax && arr[i] != Max) {
                SecMax=arr[i];
            }
        }
        if(SecMax==Integer.MIN_VALUE){
            System.out.println("No Second Maximum Element Found.");
        }
        else System.out.print("Second maximum Element Is: " + SecMax);
    }
}
