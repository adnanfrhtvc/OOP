package org.example.week4.labs.people;

public class Person {
    private String name;
    private String addressOf;
    public Person(String name, String address) {
        this.name = name;
        this.addressOf = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressOf() {
        return addressOf;
    }

    public void setAddressOf(String addressOf) {
        this.addressOf = addressOf;
    }
    @Override
    public String toString(){
        return this.name + " \n" + this.addressOf;
    }

}
