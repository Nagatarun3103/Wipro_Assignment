package JDBC_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/JDBC"; 
        String username = "root";
        String password = "Nagatarun,5"; 
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");

            
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
		
		
			
		
	}

	
/*
 Connection successful!
*/