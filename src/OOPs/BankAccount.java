package OOPs;

public class BankAccount {
    private  long accountNumber;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }



    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }
        else{
            System.out.println("Invalid Amount!");
        }
    }
    public void withdraw(double amount){
        if(balance>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw: "+amount);
        }else{
            System.out.println("Insufficient Amount!");
        }
    }

    public static void main(String[] args) {
         BankAccount bac1 = new BankAccount();
         bac1.deposit(1000);
         bac1.withdraw(200);
        System.out.println("The Balance Is: "+bac1.getBalance());
    }
}
