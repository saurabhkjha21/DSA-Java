package Stack;

import java.util.Stack;

public class TrappinRainWater {
    public static int rainwatertrapping(int[] arr){
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        int total=0;
//        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && st.peek()>arr[i] && arr[i]<arr[i+1]){
                total+=Math.min(st.peek(),arr[i+1]) - arr[i];
            }
            st.push(arr[i]);
        }
        return total;

    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,2,1,0,1,3,2,1,2,1};
        System.out.println(rainwatertrapping(arr));
    }
}
