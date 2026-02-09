public class BankAccount {
    private String owner;
    private double balance;
    static int accountCount;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        ++accountCount;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {}
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


    double deposit(double amount) {
        return balance += amount;
    }
    double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        }
        return balance -= amount;
    }

    static String printAccounts() {
        return "Accounts: " + accountCount;
    }

}
