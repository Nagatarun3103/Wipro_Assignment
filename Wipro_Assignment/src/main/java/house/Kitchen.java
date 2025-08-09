package house;

public class Kitchen {
    public void showAppliances() {
        String[] appliances = {"Fridge", "Oven", "Mixer", "Toaster"};
        
        System.out.println("Original Appliances:");
        for (String appliance : appliances) {
            System.out.println(appliance);
        }

        String[] copiedAppliances = new String[appliances.length];
        System.arraycopy(appliances, 0, copiedAppliances, 0, appliances.length);

        System.out.println("\nCopied Appliances:");
        for (String appliance : copiedAppliances) {
            System.out.println(appliance);
        }
    }
}