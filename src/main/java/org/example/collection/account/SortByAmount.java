package org.example.collection.account;

import java.util.Comparator;

public class SortByAmount implements Comparator<Account> {
    @Override
    public int compare(Account acc1, Account acc2){
        return (int)(acc1.getAmount() - acc2.getAmount());
    }
}
