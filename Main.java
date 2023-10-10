package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

    }
    public static void checkPassword(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Set your password: ");
        String password = reader.nextLine();
        while(true){
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
    public static void threeNumbers(){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter three numbers: ");
        for(int i = 0; i<3;i++) {
            int read = reader.nextInt();
            sum += read;
        }
        System.out.println("Sum is: " + sum);
    }
}