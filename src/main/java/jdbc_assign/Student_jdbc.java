package jdbc_assign;

public class Student_jdbc {
    private int id;
    private String name;
    private int age;
    private String course;
    private double marks;

    public Student_jdbc(int id, String name, int age, String course, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + course + " | " + marks;
    }
}
