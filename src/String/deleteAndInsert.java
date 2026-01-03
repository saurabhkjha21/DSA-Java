package String;

public class deleteAndInsert {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("abcdef");
       System.out.println(sb);
       sb.deleteCharAt(3);
       System.out.println(sb);
       System.out.println(sb.charAt(3));
       sb.delete(1,4);
        System.out.println(sb);
        sb.insert(2,'c');
        System.out.println(sb);
        sb.insert(2,"svgh");
        System.out.println(sb);

    }
}
