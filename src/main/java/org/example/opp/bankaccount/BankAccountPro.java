package org.example.opp.bankaccount;

public class BankAccountPro extends AbstractBankAccount{
    public BankAccountPro(String IBAN, double balance, double interestRate, double operationFee) {
        super(IBAN, balance, 0.02, 1);
    }

    @Override
    public double withdraw(double amount) {
        this.applyFee();
        this.balance -= amount;
        return amount;
    }
    @Override
    public double transfer(BankAccount bankAccount, double amount) {
        amount = this.withdraw(amount);
        bankAccount.deposit(amount);
        return amount;
    }
}
