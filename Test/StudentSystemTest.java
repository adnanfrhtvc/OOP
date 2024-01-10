package org.example.Test;

import org.example.Week9.Student;
import org.example.Week9.StudentSystem;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentSystemTest {

    StudentSystem studentSystem = new StudentSystem("students.csv");


    @Test
    void testifStudentisPresent(){
        assertFalse(studentSystem.getStudentList().isEmpty());
    }

    @Test
    void testStudentWithId100(){
        Optional<Student> student=studentSystem.getStudentById(100);
        assertFalse(student.isPresent());
    }

    @Test
    void testStudentNull() {
        Student student = studentSystem.getStudentList().get(0);
        for(Student studentFromList : studentSystem.getStudentList()){
            if(studentFromList != null){
                student = studentFromList;
            }
        }
        assertNotNull(student);
    }

    @Test
    void getHighestGPAStudentTest() {
        assertNotNull(studentSystem.getHighestGPAStudent());
    }

    @Test
    void testExceptionForEmptyStudentList(){

    }
}