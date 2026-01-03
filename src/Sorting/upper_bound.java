package Sorting;

public class upper_bound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,40,50,60,70,80};
        int n = arr.length;
        int ub =n;
        int l = 0, h=n-1;
        int target = 5;

        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid] > target){
                ub=Math.max(ub,mid);
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(ub<n){
            System.out.println(target+" "+ub);
        }
        else{
            System.out.println("No bound");
        }
    }
}
