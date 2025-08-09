package house;

import house.Hall;
import house.Kitchen;

public class Housemain {
    public static void main(String[] args) {
        Hall hall = new Hall();
        hall.display();

        System.out.println();

        Kitchen kitchen = new Kitchen();
        kitchen.showAppliances();
    }
}
