public class SpecialCheckingAccount extends CheckingAccount {
    private double minBal;
    private double interestRate;

    public SpecialCheckingAccount(int idNum, double startBal, double clc, double interestRate, double minBal) {
        super(idNum, startBal, clc);
        this.minBal = minBal;
        this.interestRate = interestRate;
    }

    public void clearCheck(double amount) {
        if (super.currentBalance() > minBal) {
            super.decreaseBalance(amount);
        }
        else {
            super.clearCheck(amount);
        }
    }

    public double monthlyInterest() {
        if (super.currentBalance() > minBal) {
            return (super.currentBalance() * interestRate) / 12;
        }
        else {
            return super.monthlyInterest();
        }
    }
}
