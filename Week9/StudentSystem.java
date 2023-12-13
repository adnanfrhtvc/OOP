package org.example.Week9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {
    private String fileName;
    private List<Student> studentList;

    public StudentSystem(String fileName) {
        this.fileName = fileName;
        this.studentList = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            List<String> lines = bufferedReader.lines().collect(Collectors.toList());
            for(String line : lines){
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String university = parts[2];
                String department = parts[3];
                double gpa = Double.parseDouble(parts[4]);

                Student student = new Student(id, name, university, department, gpa);
                studentList.add(student);
            }
        }catch (IOException e){
            System.err.println("Error reading this file: " + e.getMessage());
        }
    }
    public List<Student> readStudents(String fileName){
        List<Student> students = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            List<String> lines = bufferedReader.lines().collect(Collectors.toList());
            for(String line : lines){
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String university = parts[2];
                String department = parts[3];
                double gpa = Double.parseDouble(parts[4]);

                Student student = new Student(id, name, university, department, gpa);
                students.add(student);
            }
        }catch (IOException e){
            System.err.println("Error reading this file: " + e.getMessage());
        }
        return students;
    }
    public Optional<Student> getStudentById(int id){
        for(Student student : studentList){
            if(student.getId()==id){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }
    public Student getHighestGPAStudent(){
        double gpa = 0;
        int id=0;
        for(Student student : studentList){
            if(student.getGpa() > gpa){
                gpa=student.getGpa();
                id= student.getId();
            }
        }

        for(Student student : studentList){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        StudentSystem studentSystem = new StudentSystem("students.csv");
        System.out.println(studentSystem.readStudents("students.csv"));
        System.out.println(studentSystem.getStudentById(10));
        System.out.println(studentSystem.getHighestGPAStudent());

    }
}
