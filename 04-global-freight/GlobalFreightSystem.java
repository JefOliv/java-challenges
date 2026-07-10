/*
    *Objetivo dessa aplicação é receber uma quantidade de material em toneladas e a dividir em containers.
    *Após essa divisão iremos reportar a quantidade residual e o valor total da operação com a taxa alfandegaria inclusa.
    *Após todo o processo, será encaminha uma fatura contendo todas informações da operação.
 */

public class GlobalFreightSystem {
    public static void main(String[] args) {

        String clientName = "Jeferson Torres";
        String countryDestination = "Brazil";

        double totalWeight = 145.85;
        double maximumContainerWeight = 22.5;
        double containerBaseWeight = 1200.50;
        double customsDuty = 350.00;

        //Foi ultilizado a conversão de double para int devido a quantidade de container ser um número inteiro
        int fullContainersNeeded = (int) (totalWeight / maximumContainerWeight);

        double baseShippingDestination = fullContainersNeeded * containerBaseWeight;
        double shippingDestination = (fullContainersNeeded * containerBaseWeight) + customsDuty;
        double residue = totalWeight - (maximumContainerWeight * fullContainersNeeded);

        System.out.printf("""
                === GLOBAL FREIGHT SYSTEM BILLING ===
                Client: %s
                Destination: %s
                Total Cargo Weight: %.2f tons
                
                Logistics Breakdown:
                -> Full Containers Allocated: %d units
                -> Leftover Cargo Weight (Residue): %.2f tons
                
                Financial Summary:
                -> Base Shipping Cost: $%.2f
                -> Port Customs Fee: $%.2f
                -------------------------------------
                TOTAL INVOICE AMOUNT: $%.2f
                =====================================
                """, clientName, countryDestination, totalWeight,fullContainersNeeded, residue,baseShippingDestination,customsDuty, shippingDestination);






    }
}
