package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MaxElementInList {
    public static void main(String[] args) {
        ArrayList<Integer> maxElement = new ArrayList<>(List.of(11,23,45,67,13,90,0,45));
        int size = maxElement.size();
        int max = maxElement.get(0);
        for(int i=0; i<maxElement.size(); i++){
            if(maxElement.get(i)>max){
                max=maxElement.get(i);
            }
        }
        System.out.println("Max Element: "+max);
    }
}
