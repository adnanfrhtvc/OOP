package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Set your password: ");
        String password = reader.nextLine();
        checkPassword(password);
    }
    public static void checkPassword(String password){
        while(true){
            Scanner reader = new Scanner(System.in);
            System.out.println("Type your password: ");
            String trys = reader.nextLine();
            if (trys.equals(password)){
                System.out.println("Right!");
                break;
            } else{
                System.out.println("Wrong!");
            }
        }
    }
}