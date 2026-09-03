import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Account Type (1-Savings, 2-Current): ");
        int choice = sc.nextInt();
        
        System.out.println("Enter account number and initial balance:");
        String accnum = sc.next();
        double bal = sc.nextDouble();

        BankAccount account = (choice == 1) ? new SavingsAccount(accnum, bal, 10.0)
                                            : new CurrentAccount(accnum, bal, 2000);

        System.out.println("Enter withdrawal amount:");
        double amount = sc.nextDouble();

        if(choice == 1)
            ((SavingsAccount) account).accrueInterest();

        account.withdraw(amount);
        System.out.println("Remaining balance:" + account.getBalance());

        sc.close();
    }
}