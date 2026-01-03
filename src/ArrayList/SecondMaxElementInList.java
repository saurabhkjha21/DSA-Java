package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SecondMaxElementInList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(11,23,21,54,90,99,0,78));
        int s = list.size();
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i =0; i<s; i++){
            if(list.get(i)>max){
                secMax=max;
                max= list.get(i);
            } else if (list.get(i)>secMax && list.get(i) != max) {
                secMax= list.get(i);
            }
        }
        if(secMax == Integer.MIN_VALUE){
            System.out.println("No maximum element found");
        }
        else{
            System.out.print("Second maximum element is: "+secMax);
        }
    }
}
