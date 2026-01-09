package String;
import java.util.*;
public class revWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String sentence = sc.nextLine();
        reverseWordOfString(sentence);
        System.out.println();
        System.out.println(reverseWordOptimal(sentence));

    }
    public static void reverseWordOfString(String sentence){
        String[] words = sentence.trim().split("\\s+");

        for(int i=0; i<words.length; i++){
            char[] chars = words[i].toCharArray();
            int l=0, r=chars.length-1;
            while(l<r){
                char temp = chars[l];
                chars[l++]=chars[r];
                chars[r--]=temp;

            }
            words[i] = new String(chars);
        }

        for(String word : words){
            System.out.print(word+" ");
        }

    }
    public static String reverseWordOptimal(String sentence){
        StringBuilder sb = new StringBuilder();
        int start =0;

        for(int i=0; i<=sentence.length(); i++){
            if(i==sentence.length() || sentence.charAt(i)==' '){
                for(int j=i-1; j>=start; j--){
                    sb.append(sentence.charAt(j));
                }
                if(i< sentence.length()){
                    sb.append(' ');
                }
                start=i+1;
            }
        }
        return sb.toString();
    }

}

