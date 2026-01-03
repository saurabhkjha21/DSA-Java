package Collections.Stack;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
//        CopyOnWriteArrayList is a thread-safe variant of ArrayList from
//        java.util.concurrent package.
//        On every write operation (add, remove, update), a new copy of the underlying array is created.
//        Read operations do not need synchronization.
//                Iterators work on a snapshot of the list (no ConcurrentModificationException).
        list.add(10);
        list.add(20);
        list.add(30);

        for (Integer i : list) {
            list.add(40); // NO ConcurrentModificationException
            System.out.println(i);

        }

        System.out.println(list);
    }
}
