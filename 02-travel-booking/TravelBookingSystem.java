/* TravelBookingSystem.java
   Purpose: Simulates a travel booking confirmation system,
  calculating average daily expenses and formatting confirmation emails.
 */

public class TravelBookingSystem {
    public static void main(String[] args) {

        String clientName = "Jeferson Torres";
        String destination = "Santiago - Chile";
        double flightTickets = 4500;
        double accommodation = 2850;
        int tripDuration = 7;

        double pricePerDay = (flightTickets + accommodation) / tripDuration;

        System.out.printf("""
                === CONFIRMATION E-MAIL ===
                
                Dear %s,
                
                Your trip to %s is successfully booked!
                
                Flight Total: $%.2f
                Hotel Total: $%.2f
                Duration: %d days
                
                Average Price per Day: $%.2f
                
                Thank you for choosing us!
                ==========================
                """, clientName, destination, flightTickets, accommodation, tripDuration, pricePerDay);
    }
}
