public class Invoice {
    String partNumber; // instance variable
    String partDescription; // instance variable
    int quantity; // instance variable
    double pricePerItem; // instance variable

    // Invoice constructor that initializes the four instance variables
    public Invoice(int qty, String partNo, String partDesc, double price) {
        setPartNum(partNo);
        setPartDesc(partDesc);
        setQuantity(qty);
        setPricePerItem(price);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDesc() {
        return partDescription;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getInvoiceAmount() {
        return (double) quantity * pricePerItem;
    }

    public void setPartNum(String partNo) {
        if (partNo != null) {
            partNumber = partNo;
        } else {
            partNumber = "0";
        }
    }

    public void setPartDesc(String partDesc) {
        if (partDesc != null) {
            partDescription = partDesc;
        } else {
            partDescription = "0";
        }
    }

    public void setQuantity(int qty) {
        if (qty <= 0) {
            quantity = 0;
        } else {
            quantity = qty;
        }
    }

    public void setPricePerItem(double price) {
        if (price <= 0) {
            pricePerItem = 0.0;
        } else {
            pricePerItem = price;
        }
    }
}