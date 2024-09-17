package heranca.atividade.exercicioProposto3.entities;

public class Company extends TaxPayer {

    private int numberOfEmployees;

    public Company() {
    }

    public Company(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees < 11) {
            return anualIncome * 0.16;
        } else {
            return anualIncome * 0.14;
        }
    }

    public int getNumberOfEmplloyees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmplloyees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

}
