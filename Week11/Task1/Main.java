package org.example.Week11.Task1;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance("Spava mi se");
        logger.log("Application started");
        logger.logInfo("This is an informational message");
        logger.logWarning("This is a warning message");
        logger.logError("This is an error message");

    }
}
