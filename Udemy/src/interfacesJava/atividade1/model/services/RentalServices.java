package interfacesJava.atividade1.model.services;

import java.time.Duration;

import interfacesJava.atividade1.model.entities.CarRental;
import interfacesJava.atividade1.model.entities.InVoice;
import interfacesJava.atividade1.model.interfaceJava.TaxService;

public class RentalServices {
    private double pricePerDay;
    private double pricePerHour;
    private TaxService taxService;

    public RentalServices(double pricePerDay, double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInVoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = Math.ceil(minutes / 60);

        double basicPayment;
        if (hours <= 12) {
            basicPayment = hours * pricePerHour;
        } else {
            basicPayment = pricePerDay * (hours / 24.0);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInVoice(new InVoice(basicPayment, tax));
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(BrazilTaxService taxService) {
        this.taxService = taxService;
    }


}
