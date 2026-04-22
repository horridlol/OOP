import java.util.*;
class BankAccount{
    int accountNumber;
    String accountHolderName;
    double balance;
    void openAccount(int ano,String name,double bal){
        accountNumber=ano;
        accountHolderName=name;
        balance=bal;
    }
    void deposit(double amount){
        balance=balance+amount;
        System.out.println(accountHolderName+" deposited Rs. "+amount);
    }
    void checkBalance(){
        System.out.println("Current balance : "+balance);
    }
    void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Rs. "+amount+" withdrawm from Account number "+accountNumber+". Current balance : "+balance);
        }
    }
}

class SavingAccount extends BankAccount {
    double interestRate;
    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest added: Rs." + interest);
    }
}

class FixedDepositAccount extends BankAccount{
    int tenureYears;
    double fixedInterestRate;
    public void maturityAmount() {
        double maturity = balance * Math.pow((1 + fixedInterestRate / 100), tenureYears);
        System.out.println("Maturity amount after " + tenureYears + " years: Rs." + String.format("%.2f", maturity));
    }
}

public class prg14 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.accountHolderName="Alice";
        sa.accountNumber=001;
        sa.balance=5000;
        sa.interestRate=5;
        sa.deposit(500);
        sa.calculateInterest();
        sa.checkBalance();

        System.out.println("-----------------");

        FixedDepositAccount fda = new FixedDepositAccount();
        fda.accountNumber=001;
        fda.accountHolderName="Bob";
        fda.balance=10000;
        fda.tenureYears=3;
        fda.fixedInterestRate=7.5;
        fda.maturityAmount();
    }
}
