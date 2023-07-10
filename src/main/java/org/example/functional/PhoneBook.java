package org.example.functional;

import java.util.List;
import java.util.Optional;

public class PhoneBook {
    List<Person> list;

    public PhoneBook(List<Person> list) {
        this.list = list;
    }

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

    public Optional<Person> searchByLastname(String lastname){
        return getList().stream().filter(elem -> elem.getLastname().equals(lastname)).findFirst();
    }
    public Optional<Person> searchByNameAndLastname(String name, String lastname){
        return getList().stream().filter(elem -> elem.getName().equals(name)).filter(elem -> elem.getLastname().equals(lastname)).findFirst();
    }

    public static class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }
}
