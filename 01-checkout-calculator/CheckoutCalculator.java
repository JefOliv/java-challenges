public class CheckoutCalculator {
    public static void main(String[] args) {

        int productId = 10542;
        double unitPrice = 59.90;
        int quantity = 3;
        boolean isFreeShipping = true;

        double totalValue = unitPrice * quantity;

        System.out.println("=== PURCHASE SUMMARY ===");
        System.out.println("Product ID: " + productId + ".");
        System.out.println("Unit Price $" + unitPrice + ".");
        System.out.println("Quantity: " + quantity + ".");
        System.out.println("Total amount $" + totalValue + ".");
        System.out.println("Free Shipping Activated: " + isFreeShipping + ".");
        System.out.println("========================");
    }
}
