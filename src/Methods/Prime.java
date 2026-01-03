package Methods;

public class Prime {
    public static boolean isPrime(int number){
        if(number<=1) {
            return false;
        }
            for(int i =2; i<=number/2; i++){
                if(number%i==0){
                    return false;
                }
            }
        return true;
    }
    public static void main(String[] args){
        int num=23;
        if(isPrime(num)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
