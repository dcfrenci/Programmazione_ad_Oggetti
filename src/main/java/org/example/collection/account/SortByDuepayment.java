package org.example.collection.account;

import java.util.Comparator;

public class SortByDuepayment implements Comparator<Account> {
    public int compare(Account acc1, Account acc2){
        if(acc1.getDuePayment().isAfter(acc2.getDuePayment())){
            return 1;
        }
        else{
            return -1;
        }
    }
}
