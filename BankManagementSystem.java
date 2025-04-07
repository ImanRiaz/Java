/*Create a class BankAccount with the following:

Fields: accountHolder, balance

Constructor to initialize both fields

Method deposit(double amount) that adds to the balance

Method withdraw(double amount) that subtracts only if balance is sufficient

Method displayDetails() to print account holder and balance

🔹 In main(), create one BankAccount object and:

Deposit 1000

Withdraw 400

Display updated balance */

class BankAccount{
    int accountHolder;
     double balance=0.00;

     void deposit(double amount){
        balance+=amount;
     }

     void withdraw(double amount){
        if(balance>amount){
            balance-=amount;
        }else{
            System.out.println("Insufficient balance.");
        }
     }

     void displayDetails(int accountHolder){
        System.out.println("The account holder is "+accountHolder+". and the balance is "+balance+"$.");
     }



}
public class BankManagementSystem {
    public static void  main (String [] args){
        BankAccount b=new BankAccount();
        b.deposit(79.67);
        b.withdraw(23);
        b.displayDetails(12345678);
        b.withdraw(80.98);
        b.displayDetails(12345678);
    }
}
