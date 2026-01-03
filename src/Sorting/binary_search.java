package Sorting;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,11,29,34,35,45,56,57,67,68,70,340};
        int n = arr.length;
        int target = 68;
        int low = 0, high =n-1;
        boolean flag=false;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]<target){
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]==target){
                flag=true;
                System.out.println("Element Found: "+arr[mid]+" at index "+mid);
                break;
            }

        }
        if(!flag){
            System.out.println("Element not found. ");
        }


    }
}
