package org.example.week4.labs.people;

class Student extends Person {
    private int credits = 0;
    public Student(String name, String address) {
        super(name, address);
    }
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    public void study(){
        credits++;
    }
    public int credits(){
        return credits;
    }
}
