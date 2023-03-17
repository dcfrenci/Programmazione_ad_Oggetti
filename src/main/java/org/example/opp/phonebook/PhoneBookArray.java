package org.example.opp.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook {
    int MAX_PERSONS = 256;
    Person [] phoneBook;

    public PhoneBookArray() {
        this.phoneBook = new Person[0];
    }

    @Override
    public void addPerson(Person person) {
        if(phoneBook.length >= MAX_PERSONS) return;
        Person[] newPhoneBook = Arrays.copyOf(phoneBook, phoneBook.length + 1);
        newPhoneBook[newPhoneBook.length - 1] = person;
        this.phoneBook = newPhoneBook;
    }

    @Override
    public void removePerson(Person person) {
        Person[] newPhoneBook = new Person[phoneBook.length - 1];
        int pos = 0;
        for(Person elem: phoneBook){
            if(elem.equals(person)) continue;
            newPhoneBook[pos] = elem;
        }
        this.phoneBook = newPhoneBook;
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
