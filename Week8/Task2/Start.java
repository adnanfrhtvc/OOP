package org.example.Week8.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Start {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> grades = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            grades.add(i);
        }
        Student student = new Student("Adnan", 1, grades);

        Field[] studentFields = student.getClass().getDeclaredFields();
        for(Field f : studentFields){
            System.out.println("Field name: " + f.getName());
        }

        Method[] studentMethods = student.getClass().getDeclaredMethods();
        for(Method methods : studentMethods){
            if(methods.getName().contains("print") || methods.getName().startsWith("calculate")){
                System.out.println("Name: " + methods.getName() + ", result: " + methods.invoke(student));
            }
        }
    }
}
