package WEEK8;

public class bankingsystem {
    bankaccount bk = new bankaccount(2929,"Yogesh",7000);
    

    
}


class bankaccount{
    @SuppressWarnings("unused")
    private int accountNumber;
    @SuppressWarnings("unused")
    private String accountHoldername;
    private double accountBalance;

    
        bankaccount(int accountNumber, String accountHoldername, double accountBalance){
            this.accountNumber = accountNumber;
            this.accountHoldername = accountHoldername;
            this.accountBalance = accountBalance;
        }

        public void deposit(double money){
            this.accountBalance += money;
        }

        public void withdraw(double money){
            if(this.accountBalance-money < 0){
                System.out.println("not enough funds");
            }else{
                this.accountBalance -= money;
            }
        }
        public double getAccountBalance(){
            return this.accountBalance;
        }


     }

// You are building a banking application that has a BankAccount class.
// Implement the BankAccount class with encapsulation principles in mind.
// Include private instance variables for the
// account number, account holder name, and account balance.
// Provide public methods to allow clients to deposit and withdraw funds,
 // as well as access the account balance.
// Ensure that the account balance cannot be accessed or modified directly.
// Ensure that user cannot withdraw balance if it can go to negative
// note make constructer to fill the attribute on account opeaning
// make getter for account for account number and account holder name
// make a function display Current to display current balance