/*
    Load Calculation
    load Packet Generation
    Sending a structured email
 */


public class InventoryControlSystem {
    public static void main (String[] args) {

        String productName =  "Premium Coffee Beans";
        double loadKilograms = 1250.75;
        double standardPackage = 5.0;

        //Calculation to determine the number of packages generated
        int completedPackages = (int) (loadKilograms / standardPackage);

        //Calculation of the remainder due to an incomplete package
        double remainingWeight = loadKilograms -(standardPackage * completedPackages);

        System.out.printf("""
                === WAREHOUSE INCOMING REPORT ===
                Product: %s
                Total Weight Received: %.2f kg
                Package Standard Weight: %.2f kg
                
                Result:
                -> Full Packages Created: %d units
                -> Loose Weight Remaining : %.2f kg
                =================================
                """,productName,loadKilograms, standardPackage, completedPackages, remainingWeight );
    }
}
