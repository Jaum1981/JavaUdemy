package heranca.atividade.entities;

public final class OutsourcedEmployee extends Employee{
    
    private double addicionalCharge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double addicionalCharge) {
        super(name, hours, valuePerHour);
        this.addicionalCharge = addicionalCharge;
    }

    public double getAddicionalCharge() {
        return addicionalCharge;
    }    

    @Override
    public double payment(){
        return super.payment() + 1.1*getAddicionalCharge();
    }

}
