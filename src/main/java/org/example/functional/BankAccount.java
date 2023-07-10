package org.example.functional;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccount {
    public static List<Account> applyInterest(List<Account> accounts){
        return accounts.stream().filter(elem -> elem.getDuePayment().isAfter(LocalDateTime.now())).peek(elem -> elem.setAmount(elem.getAmount() + elem.getAmount() * elem.getInterestRate())).sorted(Comparator.comparing(Account::getAmount)).collect(Collectors.toList());
    }

    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;
        public Account(int i, double v, LocalDateTime of) {
            this.amount = i;
            this.duePayment = of;
            this.interestRate = v;
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
    }
}
