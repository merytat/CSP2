package Unit4;

public class Item {

    private String itemName;
    private double itemPrice;
    private int quantity;
    private String classs;

    @Override
    public String toString() {
        return String.format("%-20s %-10s %-10s %-5s %-10s", itemName,
                itemPrice, quantity, classs, itemPrice*quantity);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public Item(String itemName, double itemPrice, int quantity, String classs) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.classs = classs;
    }



}
