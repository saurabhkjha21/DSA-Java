package String;

public class countVowels {
    public static void main(String[] args) {
        String str="I am intelligent ultra pro max guy.";
        int vowelCount=0;
        for(int i=0; i<str.length(); i++) {
            char ch=Character.toLowerCase(str.charAt(i));
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowelCount++;
            }

        }
        System.out.println("Total No. Of Vowel is: "+vowelCount);
    }
}
