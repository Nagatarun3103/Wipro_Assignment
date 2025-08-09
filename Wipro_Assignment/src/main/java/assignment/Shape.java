package assignment;

public class Shape {

    // Area of square
    public double area(double side) {
        return side * side;
    }

    // Area of rectangle
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // Perimeter of square
    public double perimeter(double side) {
        return 4 * side;
    }

    // Perimeter of rectangle
    public double perimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }
}
