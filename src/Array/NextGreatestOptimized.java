package Array;
public class NextGreatestOptimized {
    public static void main(String[] args) {
        int[] arr = {12,8,41,90,2,49,16,28,21};
        for(int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        int n= arr.length;
        int[] ans = new int[n];
        ans[n-1]=-1; //assigned last element -1
        int nge=arr[n-1];
        for(int i=n-2; i>=0; i--){
            ans[i]=nge;
            nge=Math.max(nge, arr[i]);

        }
        for(int ele: ans) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
