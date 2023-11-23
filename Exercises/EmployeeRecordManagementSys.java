package org.example.Exercises;

import java.util.HashMap;
import java.util.Optional;

record EmployeeRecord(String employeeId, String name, String position, double salary){ }
abstract class Employee {
    private EmployeeRecord employeeRecords;
    Employee(EmployeeRecord employeeRecords){
        this.employeeRecords=employeeRecords;
    }
}
class RregularEmployee extends Employee{
    RregularEmployee(EmployeeRecord employeeRecords){
        super(employeeRecords);
    }
}
class Manager extends Employee{
    Manager(EmployeeRecord employeeRecords){
        super(employeeRecords);
    }
}
class EmployeeRecordSystem {
    HashMap<String, EmployeeRecord> employeeRecords;
    EmployeeRecordSystem(){
        this.employeeRecords=new HashMap<>();
    }
    void addEmployeeRecord(EmployeeRecord employeeRecord) {
        employeeRecords.put(employeeRecord.employeeId(), employeeRecord);
    }

    Optional<EmployeeRecord> getEmployeeRecord(String employeeId) {
        return Optional.ofNullable(employeeRecords.get(employeeId));
    }

    void updateSalary(String employeeId, double newSalary) {
        EmployeeRecord employeeRecord = employeeRecords.get(employeeId);
        EmployeeRecord employeeRecord1 = new EmployeeRecord(employeeRecord.employeeId(), employeeRecord.name(),
                employeeRecord.position(), newSalary);

        employeeRecords.put(employeeId, employeeRecord1);
    }
    double averageSalary(){
        double average=0;
        for(EmployeeRecord employee : employeeRecords.values()){
            average+= employee.salary();
        }
        return average/employeeRecords.size();
    }
}
class EmployeeRecordManagementSys {
    public static void main(String[] args) {
        // Step 5: Main Method and Testing
        // Instantiate the EmployeeRecordSystem
        EmployeeRecordSystem employeeRecordSystem = new EmployeeRecordSystem();

        // Test the methods
        employeeRecordSystem.addEmployeeRecord(new EmployeeRecord("E001", "John Doe", "Developer", 75000.0));
        employeeRecordSystem.addEmployeeRecord(new EmployeeRecord("E002", "Jane Smith", "Manager", 95000.0));

        Optional<EmployeeRecord> employeeRecord = employeeRecordSystem.getEmployeeRecord("E001");
        System.out.println("Employee Record for E001: " + employeeRecord);

        employeeRecordSystem.updateSalary("E002", 100000.0);

        double averageSalary = employeeRecordSystem.averageSalary();
        System.out.println("Average Salary: " + averageSalary);
    }
}
