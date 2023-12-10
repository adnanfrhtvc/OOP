package org.example.Week8.Task3;

import java.io.*;
import java.util.Random;

public class Events {
    public static void generateEventsFile(String fileName, int numberOfRecords) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(fileName)
        );
        Random random = new Random();

        final String[] eventsType = new String[]{"Login", "Logout", "Purchase", "ViewPage", "Error"};


        for(int i = 0; i<numberOfRecords; i++){
            bufferedWriter.write("Timestamp: " + random.nextInt(0, 24) + ":"+ random.nextInt(0,60)
                    + ", "+random.nextInt(0, 13)+ "2023");
            bufferedWriter.write(" Event Type: " + eventsType[random.nextInt(0,5)]);
            bufferedWriter.write(" User ID: " + random.nextInt(0, 100)+"\n");
            bufferedWriter.write("\n\n\n");

        }

        bufferedWriter.close();
    }
    public static void readEventsFile(String fileName) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(fileName)
        );

        String tempLine;
        while ((tempLine = bufferedReader.readLine()) != null) {
            System.out.println(tempLine);
        }


        bufferedReader.close();
    }
    public static void main(String[] args) throws IOException {
        //Neću da mi eksplodira laptop sa milion puta!!!!!!!!!!!!!
        final int numberOfRecords = 15;

        generateEventsFile("Events.txt", numberOfRecords);
        readEventsFile("Events.txt");


    }
}
