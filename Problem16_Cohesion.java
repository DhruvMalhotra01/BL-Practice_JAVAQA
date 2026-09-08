class InvoiceCalculator {

    private double calculateSubtotal(double price, int quantity) {

        return price * quantity;
    }


    private double calculateTax(double subtotal) {

        return subtotal * 0.18;
    }


    private double calculateTotal(double subtotal, double tax) {

        return subtotal + tax;
    }


    void printInvoice(String itemName, double price, int quantity) {

        double subtotal = calculateSubtotal(price, quantity);

        double tax = calculateTax(subtotal);

        double total = calculateTotal(subtotal, tax);


        System.out.println("----- Invoice -----");
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);
    }
}


public class Problem16_Cohesion {

    public static void main(String[] args) {

        InvoiceCalculator invoice = new InvoiceCalculator();

        invoice.printInvoice("Keyboard", 1500, 2);
    }
}