
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("fgdhj", 200);
        System.out.println(bankAccount.deposit(500));
        System.out.println(bankAccount.withdraw(4321));
        BankAccount bankAccount2 = new BankAccount("fgdhj", 200);
        BankAccount bankAccount3 = new BankAccount("fgdhj", 200);
        System.out.println(BankAccount.printAccounts());
    }
}