package String;

public class AlternateCharArrangement {

    public static void main(String[] args) {
        String s1 ="ab";
        String  s2 = "cd";
        String n = s1+s2;
        String s3 = "acbd";
        StringBuilder sb = new StringBuilder();
        int maxLen = Math.max(s1.length(), s2.length());
        for(int i=0; i<=s3.length(); i++){
            if(i<s1.length()){
                sb.append(s1.charAt(i));
            }
            if(i<s2.length()){
                sb.append(s2.charAt(i));
            }
        }
        System.out.println(sb);
        String s = sb.toString();
        if(s.equals(s3)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}
