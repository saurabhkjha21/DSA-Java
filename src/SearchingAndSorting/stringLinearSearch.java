package SearchingAndSorting;

import java.util.Arrays;

public class stringLinearSearch {
    public static int linearSearch(String s, char target){
        int n = s.length();
        char[] c = s.toCharArray();
        for(int i=0; i<n; i++){
            if(c[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int linearSearchIndices(String s, char target){
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i)==(target)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "saurabh";
        char target = 'a';
        System.out.println(linearSearch(s,target));
    }
}
