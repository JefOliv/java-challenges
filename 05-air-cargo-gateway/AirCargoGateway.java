public class AirCargoGateway {
    public static void main(String[] args) {
        String passengerName = "Jeferson Torres";
        String ticketClass = "ECONOMY";
        boolean isPremiumMember = false;

        // Medidas em kg e valores monetários
        double baggageWeight = 12.5;
        double allowedWeightLimit = 10.0; // Inicializada com o limite mínimo de segurança
        double extraFee = 0.00;
        String triageDecision;

        switch (ticketClass) {
            case "FIRST_CLASS":
                allowedWeightLimit = 20.0;
                break;
            case "BUSINESS":
                allowedWeightLimit = 15.0;
                break;
            case "ECONOMY":
                allowedWeightLimit = 10.0;
                break;
            default:
                allowedWeightLimit = 10.0;
                break;
        }

        if (baggageWeight > 25.0) {
            triageDecision = "DESPACHO OBRIGATÓRIO (Mala acima do limite físico de cabine)";
            extraFee = 0.00; // Não cobra taxa de excesso, força o despacho no guichê
        } else if (baggageWeight <= allowedWeightLimit) {
            triageDecision = "EMBARQUE LIBERADO GRATUITAMENTE";
            extraFee = 0.00;
        } else {)
            if (isPremiumMember) { // O mesmo que "isPremiumMember == true"
                triageDecision = "EMBARQUE LIBERADO (Isenção Premium Aplicada)";
                extraFee = 0.00;
            } else {
                triageDecision = "EMBARQUE LIBERADO COM TAXA DE EXCESSO";
                extraFee = 50.00;
            }
        }

        System.out.printf("""
                === AIR CARGO GATEWAY TRIAGE ===
                Passenger: %s
                Ticket Class: %s
                Premium Member: %b
                
                Baggage Details:
                -> Actual Weight: %.2f kg
                -> Free Allowance Limit: %.2f kg
                
                Triage Decision:
                -> Status: %s
                -> Extra Fee Charged: $%.2f
                ================================
                """, passengerName, ticketClass, isPremiumMember, 
                     baggageWeight, allowedWeightLimit, triageDecision, extraFee);
    }
}
