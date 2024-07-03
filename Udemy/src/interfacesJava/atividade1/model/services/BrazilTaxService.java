package interfacesJava.atividade1.model.services;

import interfacesJava.atividade1.model.interfaceJava.TaxService;

public class BrazilTaxService implements TaxService{

    public double tax (double amount){
        if (amount <100.00) {
            return amount*0.2;
        }else{
            return amount*0.15;
        }
    }
}
