package org.example.Exercises;

import java.util.HashMap;
import java.util.Optional;

interface GradingSystem{
    public void addGrade(String studentId, Double grade);
    Optional<Double> getGrade(String studentId);
    double calculateAverageGrade();
}
abstract class Student{
    private String studentId;
    private String name;
    Student(String studentId, String name){
        this.studentId=studentId;
        this.name=name;
    }
    public String getStudentId(){
        return studentId;
    }
    public String getName(){
        return name;
    }
    public void setStudentId(String sID){
        this.studentId=sID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class RegularStudent extends Student{
    RegularStudent(String studentId, String name) {
        super(studentId, name);
    }

}
class HonorsStudent extends Student{
    HonorsStudent(String studentId, String name){
        super(studentId, name);
    }
}
class HashMapGradingSystem implements GradingSystem{
    private HashMap<String, Double> studentGrades;
    HashMapGradingSystem(){
        this.studentGrades= new HashMap<>();
    }
    public void addGrade(String studentId, Double grade){
        studentGrades.put(studentId, grade);
    }
    public Optional<Double> getGrade(String studentId){
        return Optional.ofNullable(studentGrades.get(studentId));
    }
    @Override
    public double calculateAverageGrade(){
        double average = 0;
        for (double grade : studentGrades.values()){
            average+=grade;
        }
        average/=studentGrades.size();
        return average;
    }
}
class StudentMgmSys {
    public static void main(String[] args) {
        GradingSystem gradingSystem = new HashMapGradingSystem();


        gradingSystem.addGrade("123", 85.5);
        gradingSystem.addGrade("456", 90.0);
        gradingSystem.addGrade("789", 78.2);


        Optional<Double> grade = gradingSystem.getGrade("123");
        System.out.println("Grade for student 123: " + grade.orElse(0.0));

        double averageGrade = gradingSystem.calculateAverageGrade();
        System.out.println("Average grade: " + averageGrade);
    }
}
