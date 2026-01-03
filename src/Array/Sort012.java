package Array;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr= {0,1,2,0,1,2,1,2,0,0};
        int n= arr.length;
        int noz = 0;
        int noO = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==0) noz++;
            else if(arr[i]==1) noO++;

        }
        for(int i=0; i<noz; i++) arr[i]=0;
        for(int i=noz; i<noz+noO; i++) arr[i]=1;
        for(int i=noz+noO; i<n; i++) arr[i]=2;

        for(int ele : arr) System.out.print(ele+" ");

    }
}
