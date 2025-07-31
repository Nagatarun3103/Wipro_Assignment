package jdbc_assign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static final String URL = "jdbc:mysql://localhost:3306/JDBC";
    private static final String USER = "root";
    private static final String PASSWORD = "Nagatarun,5";

    public static Connection getConnection1() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

	
}