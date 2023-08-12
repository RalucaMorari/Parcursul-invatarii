package PRINCIPIILE.OOP.EX6;

public class SpendingAccount extends BankAccount{

    private double maxWithdrawalAmount;



    public SpendingAccount (double balance, String accountNumber, double maxWithdrawalAmount){
        super(balance, accountNumber);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }
}
