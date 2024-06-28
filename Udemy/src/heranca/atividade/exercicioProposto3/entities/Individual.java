package heranca.atividade.exercicioProposto3.entities;

public class Individual extends TaxPayer{

    private double healtExpenditures;

    public Individual(){
    }

    public Individual(String name, double anualIncome, double healtExpenditures) {
        super(name, anualIncome);
        this.healtExpenditures = healtExpenditures;
    }

    @Override
    public double tax(){
        if(anualIncome<20000){
            double aux = anualIncome*0.15;
            return aux-healtExpenditures*0.5;
        }else{
            double aux = anualIncome*0.25;
            return aux-healtExpenditures*0.5;
        }
    }

    public double getHealtExpenditures() {
        return healtExpenditures;
    }

    public void setHealtExpenditures(double healtExpenditures) {
        this.healtExpenditures = healtExpenditures;
    }
    
}
