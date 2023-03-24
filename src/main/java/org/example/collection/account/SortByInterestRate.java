package org.example.collection.account;

import java.util.Comparator;

public class SortByInterestRate implements Comparator<Account> {
    public int compare(Account acc1, Account acc2){
        return (int) (acc1.getInterestRate() - acc2.getInterestRate());
    }
}
