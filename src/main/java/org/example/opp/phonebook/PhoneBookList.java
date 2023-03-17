package org.example.opp.phonebook;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBookList implements PhoneBook {
    final int MAX_PERSONS = 256;
    ArrayList<Person> phoneBook;

    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }
    public void addPerson(Person person){
        if(phoneBook.size() == MAX_PERSONS) return;
        this.phoneBook.add(person);
    }

    @Override
    public void removePerson(Person person) {
        this.phoneBook.remove(person);
    }

    @Override
    public Person searchByLastName(String lastName) {
        for(Person person: phoneBook){
            if(lastName.equals(person.lastName)) return person;
        }
        return null;
    }

    @Override
    public Person searchByName(String name) {
        for(Person person: phoneBook){
            if(name.equals(person.name)) return person;
        }
        return null;
    }

    @Override
    public Person searchByNumber(String number) {
        for(Person person: phoneBook){
            if(number.equals(person.phone)) return person;
        }
        return null;
    }

}
