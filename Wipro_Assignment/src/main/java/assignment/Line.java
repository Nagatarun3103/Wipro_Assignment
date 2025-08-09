package assignment;

//Drawable interface
interface Drawable {
 void drawingColor();
 void thickness();
}

//Fillable interface
interface Fillable {
 void fillingColor();
 void size();
}

//Line class implementing Drawable
class Line implements Drawable {
 public void drawingColor() {
     System.out.println("Line drawing color is black.");
 }

 public void thickness() {
     System.out.println("Line thickness is 2px.");
 }
}

//Circle class implementing both Drawable and Fillable
class Circle implements Drawable, Fillable {
 public void drawingColor() {
     System.out.println("Circle drawing color is red.");
 }

 public void thickness() {
     System.out.println("Circle thickness is 3px.");
 }

 public void fillingColor() {
     System.out.println("Circle filling color is blue.");
 }

 public void size() {
     System.out.println("Circle size is radius 10 units.");
 }
}

//Square class implementing both Drawable and Fillable
class Square implements Drawable, Fillable {
 public void drawingColor() {
     System.out.println("Square drawing color is green.");
 }

 public void thickness() {
     System.out.println("Square thickness is 4px.");
 }

 public void fillingColor() {
     System.out.println("Square filling color is yellow.");
 }

 public void size() {
     System.out.println("Square size is 20x20 units.");
 }
}

