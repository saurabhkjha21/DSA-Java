package String;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "saurabh";
        char[] ch = s.toCharArray();
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
    }
}
