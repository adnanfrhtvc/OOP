package org.example.week4.labs.people;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printDepartment(List<Person> people) {
        System.out.println(people);
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 12, "BiH",1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki", 12, "BiH") );


        printDepartment(people);

    }


    }
