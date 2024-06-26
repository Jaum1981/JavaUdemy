package introPOO.entitie;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public double totalValueInStock(){
        return price*quantity;
    }

    public void addProduct(int quantity){
        this.quantity+=quantity;
    }

    public void removeProduct(int quantity){
        this.quantity-=quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){
        return name + ", price $ " 
        + String.format("%.2f", price) + ", quantity " + quantity 
        + ", Total: $ " + String.format("%.2f", totalValueInStock());
    }

}
