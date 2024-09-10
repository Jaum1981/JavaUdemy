package heranca.atividade.exercicioProposto2.entities;

import java.time.LocalDate;

public class UsedProduct extends Product {

    private LocalDate manufacturedDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, double price, LocalDate manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + " Manufacture date " + getManufacturedDate();
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

}
