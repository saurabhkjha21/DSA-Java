package String;

public class stringCompression1 {
    public static void main(String[] args) {
        String s = "ababweraaabbcddeff";
        char[] arr = s.toCharArray();
        StringBuilder ans = new StringBuilder("");
        int i=0;
        for(int j=0; j<=arr.length; j++){
            if(j==arr.length || arr[i]!=arr[j]){
                ans.append(arr[i]);
                int len =  j-i;
                if(len>=1){
                    ans.append(len);
                }
                i=j;
            }
        }
        System.out.println(ans);
    }
}
