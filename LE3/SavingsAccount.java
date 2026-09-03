public class SavingsAccount extends BankAccount{
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void accrueInterest() {
        this.balance += this.balance*(this.interestRate/100);
    }

    @Override
    public void withdraw(double amount) {
        if(this.balance >= amount)
            this.balance -= amount;
        else
            System.out.println("Insufficient funds in savings!");
    }
}