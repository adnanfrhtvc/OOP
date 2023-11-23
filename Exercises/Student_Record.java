package org.example.Exercises;

import java.util.HashMap;
import java.util.Optional;

record StudentRecord(String studentId, String name, String major, double gpa){}
abstract class Studentt{
    private StudentRecord studentRecord;
    Studentt(StudentRecord studentRecord){
        this.studentRecord=studentRecord;
    }
    public StudentRecord getStudentRecord() {
        return studentRecord;
    }

    public void setStudentRecord(StudentRecord studentRecord) {
        this.studentRecord = studentRecord;
    }
}
class UndergraduateStudent extends Studentt{
    UndergraduateStudent(StudentRecord studentRecord){
        super(studentRecord);
    }
}
class GraduateStudent extends Studentt{
    GraduateStudent(StudentRecord studentRecord){
        super(studentRecord);
    }
}
class StudentRecordSystem{
    HashMap<String, StudentRecord> hashMap;
    StudentRecordSystem(){
        this.hashMap = new HashMap<>();
    }
    void addStudentRecord(StudentRecord studentRecord){
        hashMap.put(studentRecord.studentId(), studentRecord);
    }
    Optional<StudentRecord> getStudentRecord(String studentId){
        return Optional.ofNullable(hashMap.get(studentId));
    }
    void updateGPA(String studentId, double newGPA){
        StudentRecord studentRecord = hashMap.get(studentId);
        StudentRecord studentRecord1= new StudentRecord(studentRecord.studentId(), studentRecord.name(), studentRecord.major(),
                newGPA);
        hashMap.put(studentId, studentRecord1);
    }
    double averageGPA(){
        double average =0;
        for(StudentRecord student : hashMap.values()){
            average+=student.gpa();
        }
        return average/hashMap.size();
    }
}
class Student_Record {
    public static void main(String[] args) {
        // Step 5: Main Method and Testing
        // Instantiate the StudentRecordSystem
        StudentRecordSystem studentRecordSystem = new StudentRecordSystem();

        // Test the methods
        studentRecordSystem.addStudentRecord(new StudentRecord("S001", "John Doe", "Computer Science", 3.7));
        studentRecordSystem.addStudentRecord(new StudentRecord("S002", "Jane Smith", "Engineering", 3.9));

        Optional<StudentRecord> studentRecord = studentRecordSystem.getStudentRecord("S001");
        System.out.println("Student Record for S001: " + studentRecord);

        studentRecordSystem.updateGPA("S002", 4.0);

        double averageGPA = studentRecordSystem.averageGPA();
        System.out.println("Average GPA: " + averageGPA);
    }
}
