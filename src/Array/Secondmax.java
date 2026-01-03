package Array;

public class Secondmax {
    public static void main(String[] args) {
        int[] arr = {11, 32,12,0,12,15,9,77,1};
        int n=arr.length;
        int Max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>Max){
                secMax=Max;
                Max=arr[i];
            } else if (arr[i]>secMax && arr[i]!=Max) {
                secMax=arr[i];
            }
        }
        if(secMax==Integer.MIN_VALUE) System.out.println("No second max element.");
        else System.out.println("The Second max element is : "+secMax);
    }
}
