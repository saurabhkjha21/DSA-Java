package String;

public class reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef ghi jklm op");
        int n= sb.length();
        int start=0, end=n-1;
        while(start<end){
            char temp= sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
        System.out.println(sb);
    }
}
