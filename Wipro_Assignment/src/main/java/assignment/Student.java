package assignment;

public class Student {
    
    private static int rollCounter = 1;

    
    private int rollNo;
    private String studName;
    private int marksInEng;
    private int marksInMaths;
    private int marksInScience;

    
    public Student(String studName, int marksInEng, int marksInMaths, int marksInScience) {
        this.rollNo = rollCounter++; 
        this.studName = studName;
        this.marksInEng = marksInEng;
        this.marksInMaths = marksInMaths;
        this.marksInScience = marksInScience;
    }

    
    public int getRollNo() {
        return rollNo;
    }

    public String getStudName() {
        return studName;
    }

    public int getMarksInEng() {
        return marksInEng;
    }

    public int getMarksInMaths() {
        return marksInMaths;
    }

    public int getMarksInScience() {
        return marksInScience;
    }

        public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setMarksInEng(int marksInEng) {
        this.marksInEng = marksInEng;
    }

    public void setMarksInMaths(int marksInMaths) {
        this.marksInMaths = marksInMaths;
    }

    public void setMarksInScience(int marksInScience) {
        this.marksInScience = marksInScience;
    }

    
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + studName);
        System.out.println("English: " + marksInEng);
        System.out.println("Maths: " + marksInMaths);
        System.out.println("Science: " + marksInScience);
    }

    
    public static void main(String[] args) {
        Student s1 = new Student("Tarun", 85, 90, 88);
        Student s2 = new Student("Anjali", 78, 92, 81);

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
}


/*
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

Student s = new Student(); // Create student object

System.out.print("Enter student name: ");
s.setStudName(scanner.nextLine());

System.out.print("Enter English marks: ");
s.setMarksInEng(scanner.nextInt());

System.out.print("Enter Maths marks: ");
s.setMarksInMaths(scanner.nextInt());

System.out.print("Enter Science marks: ");
s.setMarksInScience(scanner.nextInt());

// Display student details
System.out.println("\nStudent Details:");
s.displayDetails();

scanner.close();

*/