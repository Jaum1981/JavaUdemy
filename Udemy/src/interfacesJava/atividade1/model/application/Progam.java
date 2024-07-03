package interfacesJava.atividade1.model.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfacesJava.atividade1.model.entities.CarRental;
import interfacesJava.atividade1.model.entities.Veiculo;
import interfacesJava.atividade1.model.services.BrazilTaxService;
import interfacesJava.atividade1.model.services.RentalServices;

public class Progam {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rent info: ");
        System.out.print("Car model: ");
        String model = sc.nextLine();
        System.out.print("Start (dd/mm/yyyy hh:mm):");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("End (dd/mm/yyyy hh:mm):");
        LocalDateTime end = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental car = new CarRental(start, end, new Veiculo(model));

        System.out.print("Hour price: ");
        double hourPrice = sc.nextDouble();
        System.out.print("Day price: ");
        double dayPrice = sc.nextDouble();

        RentalServices rentalServices = new RentalServices(dayPrice, hourPrice, new BrazilTaxService());
        rentalServices.processInVoice(car);
        
        System.out.println("FATURA");
        System.out.println("Basic payment " + car.getInVoice().getBasicPayment());
        System.out.println("Imposto: "+ car.getInVoice().getTax());

        sc.close();
    }
}
