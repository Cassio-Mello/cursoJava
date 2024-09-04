package entities;
public class Product {
    private String name;
    private double price;
    private int quantity;

    private double totalValueInStock(){
        return price * quantity;
    }

    public String toString(){
        return name
               + " R$"
               + String.format( "%.2f", price)
               + " Quantity: "
               + quantity
               +" Total: "
               +String.format("%.2f", totalValueInStock());
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
}
