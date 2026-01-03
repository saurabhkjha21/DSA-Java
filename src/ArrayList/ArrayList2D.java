package ArrayList;

import java.util.*;

public class ArrayList2D {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c); l.add(d);

        for (int i = 0; i < l.size(); i++) {
            List<Integer> sl = l.get(i);
            for (int j = 0; j < sl.size(); j++) {
                System.out.print(sl.get(j)+" ");
            }
            System.out.println();
        }

//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(1));
//        }

    }
}
