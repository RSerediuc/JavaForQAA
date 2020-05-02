
public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice1 = new Invoice(10, "YSFYSPMF", " Red XboX Controller", 259.0);
        Invoice invoice2 = new Invoice(-1, "212XSJFOSI", "Black HyperX Headset", -0.1);

        System.out.printf("Invoice 1: \nPart Number:%s\t \nPart Description:%s\t \nQuantity: %d\t \nPrice: $%.2f\n", invoice1.getPartNumber(), invoice1.getPartDesc(), invoice1.getQuantity(), invoice1.getPricePerItem());
        System.out.println("Amount:" + invoice1.getInvoiceAmount() + "\n\n");
        System.out.printf("Invoice 2: \nPart Number:%s\t \nPart Description:%s\t \nQuantity: %d\t \nPrice: $%.2f\n", invoice2.getPartNumber(), invoice2.getPartDesc(), invoice2.getQuantity(), invoice2.getPricePerItem());
        System.out.println("Amount:" + invoice2.getInvoiceAmount());
    }
}