public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(int id, double startBal, double interestRate) {
        super(id, startBal);
        this.interestRate = interestRate;
    }

    public void withdraw(double amount) {
        if (amount <= super.currentBalance()) super.decreaseBalance(amount);
    }

    public double monthlyInterest() {
        return (super.currentBalance() * interestRate) / 12;
    }
}
