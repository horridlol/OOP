class BankAccount{
    String account_holder_name;
    double balance;
    static double interest_rate;

    BankAccount(String name,double bal){
        account_holder_name=name;
        balance=bal;
    }

    static void update_interest(double new_rate){
        interest_rate=new_rate;
    }

    void display_interest(){
        double interest_earned=balance * (interest_rate / 100);
        System.out.println("Account Holder : "+account_holder_name);
        System.out.println("Interest earned : "+interest_earned);
        System.out.println("New Balanace : "+(balance+interest_earned));
    }
}
public class prg10 {
    public static void main(String[] args) {
        BankAccount.update_interest(6.4);
        BankAccount ac1=new BankAccount("Rajesh", 10000);
        BankAccount ac2=new BankAccount("Nisha", 25000);
        ac1.display_interest();
        ac2.display_interest();
    }
}
