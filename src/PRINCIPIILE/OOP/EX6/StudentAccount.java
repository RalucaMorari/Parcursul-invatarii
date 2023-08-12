package PRINCIPIILE.OOP.EX6;

public class StudentAccount extends BankAccount {

    private double maxDepositAmount;

    public StudentAccount(double balance, String accountNumber, double maxDepositAmount) {
        super(balance, accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    public double getMaxDepositAmount() {
        return maxDepositAmount;
    }

    public void setMaxDepositAmount(double maxDepositAmount) {
        this.maxDepositAmount = maxDepositAmount;
    }
//Metoda withdraw() - se pot retrage maxim câți bani sunt în cont în momentul retragerii
//Metoda deposit() - se pot depune maxim “maxDepositAmount” bani o dată
    @Override
    public double withdraw(int amount) {
        return 0;
    }

    @Override
    public double deposit(int amount) {
        return 0;
    }
}





