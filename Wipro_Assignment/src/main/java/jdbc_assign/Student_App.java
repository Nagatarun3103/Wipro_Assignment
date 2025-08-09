package jdbc_assign;


public class Student_App {
    public static void main(String[] args) {
        Student_DAO dao = new Student_DAO();
        dao.getAllStudents().forEach(System.out::println);
    }
}

/*
1 | Anjali Reddy | 20 | Computer Science | 85.5
2 | Ravi Teja | 21 | Electronics | 78.0
3 | Sita Lakshmi | 19 | Mechanical | 91.2
4 | Arjun Kumar | 22 | Civil | 66.8
5 | Meghana Devi | 20 | Information Technology | 88.9
6 | Surya Narayan | 21 | Biotech | 72.3
7 | Priya Sharma | 20 | Electrical | 69.5
8 | Karthik Reddy | 23 | Computer Science | 94.1
*/