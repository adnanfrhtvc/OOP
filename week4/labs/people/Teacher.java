package org.example.week4.labs.people;

class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

@Override
    public String toString(){
        return super.toString() + " \n" + this.salary;
}
}
