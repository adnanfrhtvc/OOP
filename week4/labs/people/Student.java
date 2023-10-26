package org.example.week4.labs.people;

import java.util.ArrayList;

class Student extends Person {
    private int credits = 0;
    private int studentId;
    private ArrayList grades;
    public Student(String name, String address, int age, String country) {
        super(name, address, age, country);
    }
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    public int getStudentId(){ return studentId;}
    public void setStudentId(int studentId){this.studentId = studentId;}
    public void study(){
        credits++;
    }
    public int credits(){
        return credits;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
}
