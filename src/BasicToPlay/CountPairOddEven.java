package BasicToPlay;
import java.util.*;
public class CountPairOddEven {
    public static void main(String[] args){
        System.out.println("Enter array's size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        countPairOddEven(arr, n);
        int count =optimizedCountPairOddEven(arr, n);
        System.out.println(count);
        List<String> result = getEvenOddPairs(arr, n);
        System.out.println(result);

    }

    public static void countPairOddEven(int[] arr, int n){
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]%2==0 && arr[j]%2!=0 ||
                        arr[i]%2 !=0 && arr[j]%2==0){
                    count++;
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
        System.out.println("Total Count: "+count);
    }
    public static int optimizedCountPairOddEven(int[] arr, int n){
        int even=0, odd=0;
        for(int ele : arr){
            if(ele%2==0) even++;
            else odd++;
        }
        return even*odd;
    }
    public static List<String> getEvenOddPairs(int[] arr, int n){
        List<String> pairs = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]%2==0 && arr[j]%2!=0 ||
                        arr[i]%2 !=0 && arr[j]%2==0){
                    pairs.add("("+arr[i]+","+arr[j]+")");
                }
            }
        }
        return pairs;

    }
}
