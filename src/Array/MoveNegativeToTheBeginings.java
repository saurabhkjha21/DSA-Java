package Array;

public class MoveNegativeToTheBeginings {
    public static void main(String[] args) {
        int[] arr = {-1,0,8,-3,98,78,-9,-3,-3,-7,1};
        int n=arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        moveNegativesToBeginings(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
    public static void moveNegativesToBeginings(int[] arr){
        int i=0;
        int j = arr.length-1;
        while(i<=j){
            if(arr[i]<0){
                i++;
            } else if (arr[j]>=0) {
                j--;
            }else {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }
}
