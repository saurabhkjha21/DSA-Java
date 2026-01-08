package Collections.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(17);
        map.put(1,"Akshit");
        map.put(2,"Rohan");
        map.put(3,"Saloni");
        map.put(32, "Sohan");
        map.put(null, "Mohan");
        map.remove(null);

        System.out.println(map);
        System.out.println();
        System.out.println(map.get(2));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Mohan"));
        System.out.println();

        Set<Integer> keys = map.keySet();
        for(int i: keys){
            System.out.println(map.get(i));
        }

        System.out.println();
        for(int i : map.keySet()){
            System.out.println(i);
        }
        System.out.println();

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry: entries){
            System.out.println(entry.getValue().toUpperCase());
        }
        System.out.println(map);
        boolean result = map.remove(32, "Lohan");
        System.out.println(result
        );


    }

}
