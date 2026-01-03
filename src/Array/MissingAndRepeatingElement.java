package Array;

import java.util.ArrayList;

public class MissingAndRepeatingElement {
    static ArrayList<Integer> twoElement(int[] arr){
        int n = arr.length;
        int missing = -1;
        int repeating = -1;
//        Step1:- Create a frequency element
        int[] frq = new int[n+1];

        //it will store the frequency of an array
        for(int i=0; i<n; i++){
            frq[arr[i]]++;
        }

//        Step2:- Identify missing and repeating element

        for(int i=1; i<=n; i++){
            if(frq[i]==0) missing = i;
            else if(frq[i]==2) repeating = i;
        }

//        Step3:- Create an arraylist
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;




    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,1};
        ArrayList<Integer> ans = twoElement(arr);
        System.out.println("Repeating: "+ans.get(0)+" Missing:- "+ans.get(1));

    }
}
