package org.example.Week11.Task1;

public class Logger {
    private static Logger instance;

    private Logger(String connectionString) {
    }

    public static Logger getInstance(String connectionString) {
        if (instance == null) {
            instance = new Logger(connectionString);
        }
        return instance;
    }
    public void log(String message){
        Logger generalMessage = Logger.getInstance(message);
        System.out.println("This is standard log: "+ message);
    }
    public void logInfo(String message){
        Logger info = Logger.getInstance(message);
        System.out.println("This is logInfo: "+ message);
    }
    public void logWarning(String message){
        Logger warning = Logger.getInstance(message);
        System.out.println("This is a warning: "+ message);
    }
    public void logError(String message){
        Logger error = Logger.getInstance(message);
        System.out.println("This is an error: "+ message);
    }
}
