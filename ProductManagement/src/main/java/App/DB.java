package App;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harvous
 */
public class DB {
    private Connection connection;

    public DB() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:sqlite.db");

        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    public final void createSQL() {
        try (Statement statement = connection.createStatement()) {

            statement.executeUpdate("CREATE TABLE IF NOT EXISTS accounts ("
                    + "user_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "username TEXT NOT NULL UNIQUE, "
                    + "password TEXT NOT NULL, "
                    + "role TEXT"
                    + ");");

            statement.execute("CREATE TABLE IF NOT EXISTS products ("
                    + "product_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "name TEXT NOT NULL, "
                    + "price REAL, "
                    + "create_at DATETIME DEFAULT CURRENT_TIMESTAMP, "
                    + "user_id INTEGER, "
                    + "FOREIGN KEY (user_id) REFERENCES users(id)"
                    + ");");

            statement.execute("CREATE TABLE IF NOT EXISTS sessions ("
                    + "session_id TEXT PRIMARY KEY, "
                    + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP "
                    + ");");

        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }

    public void createAccount(String username, String password) {
        String sql = "INSERT INTO accounts (username, password) VALUES (?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }

    public void createSession(String session_id) {
        String sql = "INSERT INTO sessions (session_id, created_at) VALUES (?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, session_id);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);
            preparedStatement.setString(2, formattedDateTime);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }
    public String getSession() {
        String sql = "SELECT * FROM sessions";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getString("session_id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void deleteSession() {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("DELETE FROM sessions");
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }

    }
    public String getPasswordByUserName(String username) {
        String sql = "SELECT password FROM accounts WHERE username = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getString("password");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void createProduct(String name, BigDecimal price) {
        String sql = "INSERT INTO products (name, price, create_at) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setBigDecimal(2, price);

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);

            preparedStatement.setString(3, formattedDateTime);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }

    public List<Object[]> queryData(String query) {
        String sql = "select * from " + query + " ORDER by create_at DESC";
        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
            List<Object[]> data = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                BigDecimal price = resultSet.getBigDecimal("price");
                System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
                data.add(new Object[]{false, id, name, price});
            }
            return data;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteRecordById(String tableName, int id) {
        String sql = "DELETE FROM " + tableName + " WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);
            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Record with id " + id + " deleted successfully.");
            } else {
                System.out.println("No record found with id " + id + ".");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
