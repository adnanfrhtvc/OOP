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
    public static void readsNumbers(){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true){
            int read = Integer.parseInt(reader.nextLine());
            if(read == 0){
                break;
            }else{
                sum+=read;
                System.out.println("Sum now: " + sum);
            }
        }
        System.out.println("Sum in the end: " + sum);
    }
    public static void firstLastNumber(){
        Scanner reader = new Scanner(System.in);
        System.out.println("First number: ");
        int first = reader.nextInt();
        System.out.println("Last number: ");
        int last = reader.nextInt();
        while(first<=last){
            System.out.println(first);
            first++;
        }
    }
    public static void powsum(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int power = reader.nextInt();
        int sum = 0;
        for(int i = 0; i<=power; i++){
            sum += (int)Math.pow(2, i);
        }
        System.out.println("The result is: " + sum);
    }
}