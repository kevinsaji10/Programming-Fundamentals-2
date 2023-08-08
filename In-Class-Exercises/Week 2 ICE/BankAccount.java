
// This class is for Q9
public class BankAccount {
   private double balance;
   public BankAccount() {
        balance = 500;
   }
   public BankAccount(int balance) {
    this.balance = balance;
   }
   public double getBalance() {
        return balance;
   }
   public void deposit(double amount) {
        balance += amount;
   }
   public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        else {
            balance -= amount;
            return true;
        }
   }
   public boolean transfer(double amount, BankAccount otherAccount) {
    if (this.balance < amount) {
        return false;
    }
    else {
        this.balance -= amount;
        otherAccount.deposit(amount);
        return true;
    }
   }
}