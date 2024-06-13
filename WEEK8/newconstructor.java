package WEEK8;

public class newconstructor {

    public static void main(String[] args) {

        BankAccount newacc = new BankAccount(1234, "Yogesh Chaudhary", 1500);
        System.out.println("Welcome, " + newacc.getAccountHolderName());
        System.out.println("Your account number is " + newacc.getAccountNumber());
        System.out.println("Balance: " + newacc.getAccountBalance());
        newacc.depositAmount(100);
        newacc.withdrawFund(200);
         System.out.println("Your current balance is " + newacc.getAccountBalance());

        
    }

}

class BankAccount {

    int accountNumber;
    String accountHolderName;
    double accountBalance;

    BankAccount(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void depositAmount(double amount) {
        if (amount < 0) {
            System.out.println("Sorry, Insufficient fund\n");
        } else {
            this.accountBalance += amount;
            System.out.printf("You have successfully deposited %.2f in your account\n", amount);
        }
        
    }
    
    public void withdrawFund(double amount){
        if(amount < 0){
            System.out.println("Sorry invalid amount\n");
        }
        else{
            this.accountBalance-=amount;
            System.out.printf("Amount %.2f successfully withdrawn\n",amount);
        }
    }
}
