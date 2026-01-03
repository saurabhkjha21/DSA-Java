package Pattern;

public class numberSpriral {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print(n);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
