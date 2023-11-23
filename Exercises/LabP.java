package org.example.Exercises;

interface Logger{
    void logMessage(String message);
}
record RecordLogger(String name) implements Logger{
    @Override
    public void logMessage(String message){
        System.out.println("Log name: "+ name+ "\n message: "+ message);
    }
}
class ClassLogger implements Logger{
    private String name;
    ClassLogger(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String message) {
        this.name = message;
    }

    @Override
    public void logMessage(String message){
        System.out.println("Log name: " + name + "\n message: " + message);
    }
}
class LabP {
    public static void main(String[] args) {
        RecordLogger recordLogger = new RecordLogger("Ajdin");
        ClassLogger classLogger = new ClassLogger("Besic");


        Logger object1 = (String message) -> recordLogger.logMessage("Some message");
        Logger object2 = (String message) -> classLogger.logMessage("Some message");

        object1.logMessage("Some message");
        object2.logMessage("Some message");



    }
}
