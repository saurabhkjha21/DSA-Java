package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class LastOccurenceOfX {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(5,10,15,20,30,25,10));
        int x=10;
        int lastOccurrence = -1;
        for(int i=0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();
        for(int i=arrayList.size() -1; i>=0; i--){
            if(arrayList.get(i)==x) {
                lastOccurrence = i;
                break;
            }
        }
        if(lastOccurrence!=-1){
            System.out.println("Last Occurrence of "+ x +" is at index: "+lastOccurrence);
        }
        else{
            System.out.println(x+" not found in the arrayList");
        }
    }
}

