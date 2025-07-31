package assignment;

import java.util.Scanner;

public class Ass14 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Scanner scanner = new Scanner(System.in);

        // For Square
        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();

        System.out.println("Area of Square: " + shape.area(side));
        System.out.println("Perimeter of Square: " + shape.perimeter(side));

        // For Rectangle
        System.out.print("\nEnter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        System.out.println("Area of Rectangle: " + shape.area(length, breadth));
        System.out.println("Perimeter of Rectangle: " + shape.perimeter(length, breadth));
    }
}
