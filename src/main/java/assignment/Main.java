package assignment;

public class Main {
 public static void main(String[] args) {
     Person athlete = new Athlete();
     Person lazyPerson = new LazyPerson();

     System.out.println("Athlete's routine:");
     athlete.eat();
     athlete.exercise();

     System.out.println("\nLazy Person's routine:");
     lazyPerson.eat();
     lazyPerson.exercise();
 }
}

/*
 Athlete's routine:
Athlete eats a high-protein, balanced diet.
Athlete exercises rigorously every day.

Lazy Person's routine:
Lazy person eats junk food while watching TV.
Lazy person rarely exercises and prefers sleeping.


*/