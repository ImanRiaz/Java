class BankAccount1{
    String accountnumber;
    double balance;

    void deposit(double amount){
        balance+=amount;
    }

    void displaybalance(){
        System.out.println("Your account number is:"+accountnumber);
        System.out.println("Your current balance is: "+balance);
    }
}
public class BankAccount {
    public static void main(){
    BankAccount1 b=new BankAccount1();
    b.deposit(500);
    b.accountnumber="12345";
    b.balance=2343;
    b.displaybalance();

}
}
