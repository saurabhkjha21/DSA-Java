package String;

public class minValue {
    public static String purify(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return "0";
    }
    public static String min(String a, String b){
        String s= purify(a), t=purify(b);
        if(s.length()<t.length()) return a;
        if(s.length()>t.length()) return b;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=t.charAt(i)){
                return (s.charAt(i)<t.charAt(i)) ? a:b;
            }
        }
        return (a.length()<=b.length()) ? a:b;
    }
    public static void main(String[] args) {
        String[] arr = {"0078","90","67","00000009","00000000"};
        String minS= arr[0];
        for (int i = 0; i < arr.length; i++) {
            minS=min(minS,arr[i]);
        }
        System.out.println(minS);
    }

}
