package heranca.atividade.exercicioProposto2.entities;

public class ImportedProduct extends Product {

    private double customsFee;

    public ImportedProduct() {

    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return super.getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + customsFee + "(Custom fee: $" + getCustomsFee() + ")";
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }


}
