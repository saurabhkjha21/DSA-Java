package Collections.List;

import java.util.*;

public class class02 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));

        students.sort((o1, o2) -> Double.compare(o1.getGpa() , o2.getGpa()));
        for(Student s: students){
            System.out.println(s.getName() + " "+ s.getGpa());
        }

        System.out.println();
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).thenComparing(Student::getName);
        students.sort(comparator);
        for(Student s: students){
            System.out.println(s.getName() + " "+ s.getGpa());
        }


    }
}
