package org.example.Exercises;

import java.sql.*;
class baza {
    private static final String URL = "jdbc:mysql://localhost:3307/dbjava";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    public baza(){
        try{
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT FirstName FROM customers"
            );
            while (resultSet.next()){
                System.out.println("Name: "+ resultSet.getString(1));
            }
            connection.close();
        }
        catch (SQLException e){
            throw new RuntimeException();
        }
    }
}
class Main{
    public static void main(String[] args){
        baza baza = new baza();
        baza.toString();
    }
}