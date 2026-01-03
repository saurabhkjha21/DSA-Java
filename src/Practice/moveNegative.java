package Practice;

public class moveNegative {
    public static void move(int[] arr){
            int left=0, right=arr.length-1;
            while(left<right){
                while(left<right && arr[left]<0) left++;
                while(right>left && arr[right]>=0) right--;
                if(left<right){
                    int temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
                }
            }
        for (int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,3,-1,-2,0,5,-5,6,-7,9,-9,0};

        move(arr);

    }
}
