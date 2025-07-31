package assignment;

enum Currency {
 ONE,
 FIVE,
 TEN,
 TWENTY,
 FIFTY,
 HUNDRED
}

public class Ass27 {
 public static void main(String[] args) {

     System.out.println("Available Paper Currencies:");
     for (Currency c : Currency.values()) {
         System.out.println(c);
     }

     System.out.println("\nCurrency Descriptions:");

     for (Currency c : Currency.values()) {
         switch (c) {
             case ONE:
                 System.out.println("ONE: Smallest paper currency note.");
                 break;
             case FIVE:
                 System.out.println("FIVE: Often used for small purchases.");
                 break;
             case TEN:
                 System.out.println("TEN: Commonly used in daily transactions.");
                 break;
             case TWENTY:
                 System.out.println("TWENTY: Mid-range denomination.");
                 break;
             case FIFTY:
                 System.out.println("FIFTY: Useful for moderate purchases.");
                 break;
             case HUNDRED:
                 System.out.println("HUNDRED: High-value note used frequently.");
                 break;
         }
     }
 }
}

/*
 * Available Paper Currencies:
ONE
FIVE
TEN
TWENTY
FIFTY
HUNDRED

Currency Descriptions:
ONE: Smallest paper currency note.
FIVE: Often used for small purchases.
TEN: Commonly used in daily transactions.
TWENTY: Mid-range denomination.
FIFTY: Useful for moderate purchases.
HUNDRED: High-value note used frequently.
*/
