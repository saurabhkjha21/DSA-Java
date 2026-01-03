package Sorting;

public class lower_bound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        int lb = n;
        int target=55;
        int l=0, h=n-1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid]>=target){
                lb= Math.min(lb,mid); // mid
                h=mid-1;
            }
            else {
                l = mid + 1;
            }
        }
        System.out.println(target+" "+lb);
//        if(lb < n){
//            System.out.println(target+ " "+lb);
//        }
//        else{
//            System.out.println("No Bound");
//        }

    }
}
