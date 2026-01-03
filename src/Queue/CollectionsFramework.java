package Queue;
import java.util.*;
public class CollectionsFramework {
    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        //here. Queue is an interface and ArrayDeque and LinkedList are class

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.print(q.remove()+"->");
        }
        System.out.println();
    }
}
