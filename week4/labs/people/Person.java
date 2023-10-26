package org.example.week4.labs.people;

public class Person {
    private String name;
    private String addressOf;
    private int age;
    private String country;
    public Person(String name, String address, int age, String country) {
        this.name = name;
        this.addressOf = address;
        this.age = age;
        this.country = country;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString(){
        return this.name + " \n" + this.addressOf;
    }

}
