package ArrayList;
import java.util.ArrayList;
public class Basic1 {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<String>();
        fruit.add("mango"); //adding elements
        fruit.add("banana");
        fruit.add("orange");
        for(String item:fruit){
            System.out.print(item+" ");
        }
        System.out.println();
        fruit.add("grapes");
        String list=fruit.get(1);
        System.out.print(list);
        fruit.set(0,"cherry");
        fruit.remove("banana");
        System.out.println();
        boolean containsOrange=list.contains("orange");
        System.out.print(containsOrange);
        int size=fruit.size();
        System.out.println();
        System.out.print("Size: "+size);
        System.out.println();
        for(String item:fruit){
            System.out.print(item+" ");
        }
        System.out.println();
        fruit.clear();
        boolean isEmpty=fruit.isEmpty();
        System.out.print(isEmpty);



    }
}
