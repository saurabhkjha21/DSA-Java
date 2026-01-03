package Practice;

import java.util.ArrayList;
import java.util.List;

public class createNumber {
    public static  void createEveryPossibleNumber(String s, String ans, List<Integer> result){
        if(s.length()==0){
            result.add(Integer.parseInt(ans));
            return;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String rest = left+right;
            createEveryPossibleNumber(rest, ans+ch, result );
        }
    }
    public static void main(String[] args) {
        int n = 415;
        String s = String.valueOf(n);
        List<Integer>  result = new ArrayList<>();

        createEveryPossibleNumber(s,"", result);
        System.out.println(result);
        System.out.println(result.size());
    }

}
