package Collections.List;

import java.util.*;

public class class01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);

//        list.remove(Integer.valueOf(1));
        System.out.println(list);


//        Object[] array=list.toArray();
//
//        Integer[] array1 = list.toArray(new Integer[0]);
//        System.out.println(array1);
        Collections.sort(list);
        System.out.println(list);
        list.sort(null);
        System.out.println(list);
        list.sort(Comparator.comparingInt(a -> a));
        System.out.println(list);
        list.sort((a, b) -> b - a);
        System.out.println(list);


        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort(null);
        System.out.println(words);
//        words.sort(new StringLengthComparator());
//        System.out.println(words);

        //Lambda expression
        words.sort((a, b) -> a.length() - b.length());//asc order
        System.out.println(words);
        words.sort((a, b) -> b.length() - a.length());//desc order
        System.out.println(words);


    }
//    static class StringLengthComparator implements Comparator<String>{
//        @Override
//        public int compare(String s1 , String s2){
//            return s1.length() - s2.length();
//        }
//    }

}
