package PRINCIPIILE.OOP.EX6;

public class SpendingAccount extends BankAccount{

    private double maxWithdrawalAmount;



    public SpendingAccount (double balance, String accountNumber, double maxWithdrawalAmount){
        super(balance, accountNumber);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public double getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    public void setMaxWithdrawalAmount(double maxWithdrawalAmount) {
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    //Metode:
    //
    //Metoda withdraw() - se pot retrage cu maxim “maxWithdrawalAmount” RON mai mult decât există în cont în momentul retragerii (exemplu: dacă în cont sunt 5000 de RON, iar maxWithdrawalAmount este 2000 RON, se pot retrage maxim 7000 RON)
    //Metoda deposit() - oricâți bani se pot depune în cont
    @Override
    public double withdraw(int amount) {
        return 0;
    }

    @Override
    public double deposit(int amount) {
        return 0;
    }
}
