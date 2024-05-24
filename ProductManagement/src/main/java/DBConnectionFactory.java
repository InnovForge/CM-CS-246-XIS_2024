/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bluez
 */
public class DBConnectionFactory {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/login_product";
    private static final String DATABASE_USER_NAME = "root";
    private static final String DATABASE_PASSWORD = "";
    public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection(DATABASE_URL, DATABASE_USER_NAME, DATABASE_PASSWORD);
    }
    
}
