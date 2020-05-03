import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice1 = new Invoice(10, "YSFYSPMF", " Book", 259.0);
        Invoice invoice2 = new Invoice(-1, "212XSJFOSI", "Black HyperX Headset", -0.1);

        System.out.printf("Invoice 1: \nPart Number:%s\t \nPart Description:%s\t \nQuantity: %d\t \nPrice: $%.2f\n", invoice1.getPartNumber(), invoice1.getPartDesc(), invoice1.getQuantity(), invoice1.getPricePerItem());
        System.out.println("Amount:" + invoice1.getInvoiceAmount() + "\n\n");
        System.out.printf("Invoice 2: \nPart Number:%s\t \nPart Description:%s\t \nQuantity: %d\t \nPrice: $%.2f\n", invoice2.getPartNumber(), invoice2.getPartDesc(), invoice2.getQuantity(), invoice2.getPricePerItem());
        System.out.println("Amount:" + invoice2.getInvoiceAmount());


        // Bonus:  using scanner to get input from user and check if invoice shows correct details
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nPlease tell us the part number: ");
        String partNo = input.next();
        invoice1.setPartNum(partNo);

        System.out.println("Please give us a description of the item you desire to purchase: ");
        String partDesc = input.next();
        invoice1.setPartDesc(partDesc);

        System.out.println("Please enter the quantity:");
        int quantity = input.nextInt();
        invoice1.setQuantity(quantity);

        System.out.println("Please enter the price: ");
        double price = input.nextDouble();
        invoice1.setPricePerItem(price);

        System.out.printf("Invoice 1: \nPart Number:%s\t \nPart Description:%s\t \nQuantity: %d\t \nPrice: $%.2f\n", invoice1.getPartNumber(), invoice1.getPartDesc(), invoice1.getQuantity(), invoice1.getPricePerItem());
        System.out.println("Amount:$" + invoice1.getInvoiceAmount() + "\n\n");
    }
}