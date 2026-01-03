package String;

public class GenerateSubstring {
    public static String printSubstring(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        // char[] c = s.toCharArray(i);
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                sb.append(s.substring(i,j+1)).append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.print(printSubstring(s)+" ");
    }
}
