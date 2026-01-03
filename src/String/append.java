package String;

public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABC");
        System.out.println(sb);
        sb.append(21);
        System.out.println(sb);
        sb.append("abc");
        System.out.println(sb);
        char[] ch = {'s', 'a', 'u'};
        sb.append(ch);
        System.out.println(sb);
        //int[] arr={1,2,4,4};
        //sb.append(arr);//append address of array , doesn't word
        //System.out.println(sb);
        StringBuilder a = new StringBuilder("pqr");
        sb.append(a);
        System.out.println(sb);
    }
}
