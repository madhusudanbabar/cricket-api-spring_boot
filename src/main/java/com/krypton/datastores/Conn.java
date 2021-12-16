package com.krypton.datastores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {


    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/spring";
            connection = DriverManager.getConnection(url, "root", "Admin@123");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
