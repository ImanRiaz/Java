class BankAccount1 {
    String accountNumber; 
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void displayBalance() { 
        System.out.println("Your account number is: " + accountNumber);
        System.out.println("Your current balance is: " + balance);
    }
}

public class account { 
    public static void main(String[] args) {
        BankAccount1 b = new BankAccount1(); 
        b.deposit(500);
        b.accountNumber = "12345"; 
        b.balance = 2343;
        b.displayBalance();
    }
}
