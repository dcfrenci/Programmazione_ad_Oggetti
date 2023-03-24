package org.example.collection.account;

import java.util.Collection;
import java.util.List;

public class SortAccount{
    public static void sortByAmount(List<Account> accounts){
        accounts.sort(new SortByAmount());
    }
    public static void sortByInterestRate(List<Account> accounts){
        accounts.sort(new SortByInterestRate());
    }
    public static void sortByDuePayment(List<Account> accounts){
        accounts.sort(new SortByDuepayment());
    }
}
