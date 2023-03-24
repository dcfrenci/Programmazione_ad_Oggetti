package org.example.opp.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Library {
    ArrayList<Rent> rents;

    public Library() {
        this.rents = new ArrayList<>();
    }
    public boolean addRent(Rent rent){
        return this.rents.add(rent);
    }
    public boolean removeRent(Rent rent){
        return this.rents.remove(rent);
    }
    public ArrayList<Rent> getExpired(LocalDate localDate){
        ArrayList<Rent> expired = new ArrayList<>();
        for(Rent rent: rents){
            if(rent.isExpired(localDate)) expired.add(rent);
        }
        return expired;
    }
}
