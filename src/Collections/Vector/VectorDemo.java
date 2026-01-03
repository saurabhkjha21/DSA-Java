package Collections.Vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(3, 3);//initial capacity 10
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(2);
        System.out.println(vector.capacity());//when capacity not given newCapacity = oldCapacity * 2
        //newCapacity = oldCapacity + capacityIncrement
        vector.add(1);
        vector.add(1);
        Vector<Integer> linkedlist = new Vector<>();
        vector.add(2);
        vector.add(2);
        System.out.println(vector.capacity());
        Vector<Integer> vector1 = new Vector<>(linkedlist);
        System.out.println(vector1);

    }
}
