//package com.ciicc.augustone.jdbc;
//
//import java.sql.*;
//
//public class Jdbc {
//    static final String DB_URL = "jdbc:mysql://localhost:3306/batch10_db";
//    static final String USER = "root";
//    static final String PASS = "";
//    static final String QUERY = "select * from students";
//
//    public static void main(String[] args) {
//
//        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
//             Statement statement = connection.createStatement();
//             ResultSet resultSet = statement.executeQuery(QUERY);) {
//            while (resultSet.next()) {
//                System.out.print("ID: " + resultSet.getInt("id"));
//                System.out.print(", First Name: " + resultSet.getString("first_name"));
//                System.out.println(", Last Name: " + resultSet.getString("last_name"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
