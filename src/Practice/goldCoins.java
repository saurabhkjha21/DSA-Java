package Practice;

import java.util.Scanner;

public class goldCoins {
    public static int maxIndices(int[] arrayA, int[] arrayB, int k){
        int count =0;
        for(int i=0; i<arrayB.length; i++){
            for (int j = 0; j < arrayA.length; j++) {
                if(arrayB[i]+1==arrayA[j]) {
                    count++;
                    k--;
                    if (k<=0) {
                        return -1;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        int[] arrayA = {3,6,2,0,9};
        int[] arrayB = {10,8,7,4,2};

        int result = maxIndices(arrayA, arrayB, k);
        System.out.println(result);
    }
}
