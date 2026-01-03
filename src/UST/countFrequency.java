package UST;

import java.util.HashMap;

public class countFrequency {
    public static void main(String[] args) {
        String s = "RAM is my name.";
        HashMap<Character, Integer> frq = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            frq.put(ch, frq.getOrDefault(ch, 0) + 1);
        }
        System.out.println(frq);
    }
}
