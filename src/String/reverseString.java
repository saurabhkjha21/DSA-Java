package String;

public class reverseString {
    public static void main(String[] args) {
        String s = "hello";
        char[] ans = s.toCharArray();
        int left = 0, right=ans.length-1;
        while(left<right){
            char temp=ans[left];
            ans[left]=ans[right];
            ans[right]=temp;
            left++;
            right--;
        }
        System.out.println(ans);


        StringBuilder sb = new StringBuilder(s);
        int start=0, end=sb.length()-1;
        while(start<=end){
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
        System.out.println(sb);

        System.out.println(sb.reverse());
    }
}
