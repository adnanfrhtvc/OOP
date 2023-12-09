package org.example.Week8.Task2;

import java.util.ArrayList;

public class GradeAnalyzer{
    GradeAnalyzer(ArrayList<Integer> grades){}
    public float averageGrade(ArrayList<Integer> grades){
        float average;
        int sum = 0;
        for(int grade : grades){
            sum+=grade;
        }
        average=sum/grades.size();
        return average;
    }
    public void printSummary(ArrayList<Integer> grades){
        System.out.println("Average grade is: " + averageGrade(grades));
    }
}
