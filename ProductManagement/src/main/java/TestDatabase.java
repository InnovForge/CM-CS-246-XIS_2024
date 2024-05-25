
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import App.DB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bluez
 */
public class TestDatabase {
    public static void main(String[] args) {
        
        DB d = new DB();
        d.addUser("admin", "12345");
        
    }
}
