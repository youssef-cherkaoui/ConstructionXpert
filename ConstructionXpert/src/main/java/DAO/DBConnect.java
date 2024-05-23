package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {


    private static final String jdbcURL = "jdbc:mysql://localhost:3306/consxpert";
    private static final String jdbcUserName = "root";
    private static final String jdbcPassword = "azer@123";
    private static final String jdbcDriver = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(jdbcDriver);
        return DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);
    }

}
