package assignment;

public class measure {
	 public static void main(String[] args) {
	     Line line = new Line();
	     Circle circle = new Circle();
	     Square square = new Square();

	     System.out.println("Line:");
	     line.drawingColor();
	     line.thickness();

	     System.out.println("\nCircle:");
	     circle.drawingColor();
	     circle.thickness();
	     circle.fillingColor();
	     circle.size();

	     System.out.println("\nSquare:");
	     square.drawingColor();
	     square.thickness();
	     square.fillingColor();
	     square.size();
	 }
	}
