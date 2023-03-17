package org.example.opp.bankaccount;

abstract class AbstractBankAccount implements BankAccount {
    String IBAN;
    double balance;
    double interestRate;
    double operationFee;

    public AbstractBankAccount(String IBAN, double balance, double interestRate, double operationFee) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.interestRate = interestRate;
        this.operationFee = operationFee;
    }

    @Override
    public void addInterest() {
        this.balance -= (balance * interestRate * 365) / 36500;
    }
    public void applyFee(){

    }
    public void checkIBAN(String IBAN){

    }
    public void deposit(double amount){
        this.balance += (amount + this.operationFee);
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getOperationFee() {
        return operationFee;
    }

    public void setOperationFee(double operationFee) {
        this.operationFee = operationFee;
    }
    public double transfer(BankAccount bankAccount, double amount){
        amount = withdraw(amount);
        bankAccount.deposit(amount);
        return amount;
    }
}
