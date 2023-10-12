package org.example;

import java.util.Random;
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
    public static void printText(){
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times do you want the text to be printed?");
        int times = reader.nextInt();
        for(int i = 0; i<times; i++){
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
        }
    }
    public static void printStars(int amount){
        for(int i = 0; i<amount; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void drawStarsPiramid(int rows){
        for (int i = 1; i<=rows; i++){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedDrawStarsPiramid(int rows){
        for(int i = 0; i <rows; i++){
            for(int j = rows; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawNumberPiramid(int rows){
        for(int i = 1; i <=rows; i++){
            for(int j = 1; j<i+1;  j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void guessingGame(){
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(0,101);
        int guesses = 0;
        System.out.println(numberToGuess);
        while (true){
            System.out.print("Guess a number: ");
            int userGuess = reader.nextInt();
            if(userGuess==numberToGuess){
                System.out.println("Congratulations, your guess is correct!");
                break;
            }else if(userGuess<numberToGuess){
                guesses++;
                System.out.println("The number is greater, guesses made: "+ guesses);
            }else{
                guesses++;
                System.out.println("The number is lesser, guesses made: "+ guesses);
            }
        }
    }
}