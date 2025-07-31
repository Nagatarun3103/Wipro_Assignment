package assignment;

//Abstract class Person
abstract class Person {
 // Abstract methods
 abstract void eat();
 abstract void exercise();
}

//Subclass Athlete
class Athlete extends Person {
 @Override
 void eat() {
     System.out.println("Athlete eats a high-protein, balanced diet.");
 }

 @Override
 void exercise() {
     System.out.println("Athlete exercises rigorously every day.");
 }
}

//Subclass LazyPerson
class LazyPerson extends Person {
 @Override
 void eat() {
     System.out.println("Lazy person eats junk food while watching TV.");
 }

 @Override
 void exercise() {
     System.out.println("Lazy person rarely exercises and prefers sleeping.");
 }
}
