package generics.genericsDelimitado.entities;

public class Products implements Comparable<Products> {

    private String name;
    private Double price;

    public Products(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products [name=" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Products o) {
        return price.compareTo(o.getPrice());
    }


}
