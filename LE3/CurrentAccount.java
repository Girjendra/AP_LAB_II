public class CurrentAccount extends BankAccount {
    double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(this.balance + this.overdraftLimit >= amount)
            this.balance -= amount;
        else
            System.out.println("Overdraft limit exceeded!");
    }
}
