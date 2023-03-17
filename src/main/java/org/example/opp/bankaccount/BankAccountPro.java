package org.example.opp.bankaccount;

public class BankAccountPro extends AbstractBankAccount{
    public BankAccountPro(String IBAN, double balance, double interestRate, double operationFee) {
        super(IBAN, balance, interestRate, operationFee);
    }

    @Override
    public double withdraw(double amount) {
        this.balance -= (amount + operationFee);
        return amount;
    }
    @Override
    public double transfer(BankAccount bankAccount, double amount) {
        return super.transfer(bankAccount, amount);
    }
}
