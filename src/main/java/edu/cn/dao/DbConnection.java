package edu.cn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public static Connection getConnect() {

            Connection conn = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/book?user=root&password=123");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("Driver");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("URL");
            }

            return conn;
        }
}

