package org.example.collection.account;

import java.time.LocalDateTime;

public class Account implements Comparable<Account> {
    double amount;
    double interestRate;
    LocalDateTime duePayment;

    public Account(double amount, double interestRate, LocalDateTime duePayment) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.duePayment = duePayment;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public LocalDateTime getDuePayment() {
        return duePayment;
    }

    public void setDuePayment(LocalDateTime duePayment) {
        this.duePayment = duePayment;
    }
    public int compareTo(Account account){
        return this.compareTo(account);
    }
}
