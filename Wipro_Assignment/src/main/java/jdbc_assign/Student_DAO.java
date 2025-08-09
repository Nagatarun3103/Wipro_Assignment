package jdbc_assign;

import java.sql.*;
import java.util.*;

import jdbc_assign.Student_jdbc;

public class Student_DAO {
    public List<Student_jdbc> getAllStudents() {
        List<Student_jdbc> students = new ArrayList<>();
        try (Connection con = DBconnection.getConnection1();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Student_jdbc")) {

            while (rs.next()) {
                students.add(new Student_jdbc(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("course"),
                    rs.getDouble("marks")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}