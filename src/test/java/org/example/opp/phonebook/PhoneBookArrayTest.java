package org.example.opp.phonebook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookArrayTest {

    PhoneBook book = new PhoneBookArray();
    PhoneBook temp = new PhoneBookArray();
    Person person = new Person("Farioli", "Marco", "3932451037");
    @Test
    void addPerson() {
        book.addPerson(person);
        assertEquals(book.searchByLastName("Farioli"), person);
    }

    @Test
    void removePerson() {
        book.addPerson(person);
        book.removePerson(person);
        assertEquals(null, book.searchByLastName("Farioli"));
    }

    @Test
    void searchByLastName() {
        book.addPerson(person);
        assertEquals(person, book.searchByLastName(person.lastName));
    }

    @Test
    void searchByName() {
        book.addPerson(person);
        assertEquals(person, book.searchByName(person.name));
    }

    @Test
    void searchByNumber() {
        book.addPerson(person);
        assertEquals(person, book.searchByNumber(person.phone));
    }
}