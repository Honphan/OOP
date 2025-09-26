package org.example.javafx_mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {
    private static final String URL = "jdbc:mysql://localhost:3306/demo";
    private static final String USER = "root";
    private static final String PASSWORD = "2005"; // sửa theo mật khẩu MySQL của bạn

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
