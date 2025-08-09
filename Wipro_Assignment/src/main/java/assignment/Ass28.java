package assignment;

//Functional Interface
interface PerformOperation {
 boolean check(int num);
}

public class Ass28 {

 // Returns a lambda to check if a number is odd
 public static PerformOperation isOdd() {
     return (num) -> num % 2 != 0;
 }

 // Returns a lambda to check if a number is prime
 public static PerformOperation isPrime() {
     return (num) -> {
         if (num <= 1) return false;
         for (int i = 2; i <= Math.sqrt(num); i++) {
             if (num % i == 0) return false;
         }
         return true;
     };
 }

 // Returns a lambda to check if a number is a palindrome
 public static PerformOperation isPalindrome() {
     return (num) -> {
         String str = Integer.toString(num);
         return str.equals(new StringBuilder(str).reverse().toString());
     };
 }

 // Method to test the lambda
 public static void testOperation(PerformOperation op, int num) {
     System.out.println("Result: " + op.check(num));
 }

 // Main method to test all
 public static void main(String[] args) {
     int testNum1 = 7;     // odd and prime
     int testNum2 = 121;   // palindrome
     int testNum3 = 10;    // even, not prime, not palindrome

     System.out.print("Is " + testNum1 + " odd? ");
     testOperation(isOdd(), testNum1);

     System.out.print("Is " + testNum1 + " prime? ");
     testOperation(isPrime(), testNum1);

     System.out.print("Is " + testNum2 + " a palindrome? ");
     testOperation(isPalindrome(), testNum2);

     System.out.print("Is " + testNum3 + " prime? ");
     testOperation(isPrime(), testNum3);

     System.out.print("Is " + testNum3 + " a palindrome? ");
     testOperation(isPalindrome(), testNum3);
 }
}
/*
 * Is 7 odd? Result: true
Is 7 prime? Result: true
Is 121 a palindrome? Result: true
Is 10 prime? Result: false
Is 10 a palindrome? Result: false

*/