package org.example.opp.bankaccount;

public class BankAccoutEasy extends AbstractBankAccount{

    public BankAccoutEasy(String IBAN, double balance) {
        super(IBAN, balance, 0, 0);
    }

    @Override
    public double withdraw(double amount) {
        this.balance -= amount;
        if(balance < 0) {
            amount -= balance;
            this.balance = 0;
        }
        return amount;
    }

    @Override
    public double transfer(BankAccount bankAccount, double amount) {
        if(this.IBAN.substring(0, 2).equals(bankAccount.getIBAN().substring(0,2))) return super.transfer(bankAccount, amount);
        return 0;
    }
}
