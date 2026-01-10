package org.example.module_6_file_handling.character_stream.json_file;

public class Person {
    String personName;

    Address address;

    public String getPersonName() {
        return personName;
    }

    public Address getAddress() {
        return address;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", address street=" + address.street +
                " city =" + address.city +
                '}';
    }
}
