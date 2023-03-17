package org.example.opp.phonebook;

public interface PhoneBook {
    void addPerson(Person person);
    void removePerson(Person person);
    Person searchByLastName(String lastName);
    Person searchByName(String name);
    Person searchByNumber(String number);
}
