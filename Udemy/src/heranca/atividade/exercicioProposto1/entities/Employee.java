package heranca.atividade.exercicioProposto1.entities;

public class Employee {
    private String name;
    private Integer hours;
    private double valuePerHour;

    public Employee() {

    }

    public Employee(String name, Integer hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }


    public double payment() {
        return getHours() * getValuePerHour();
    }

    // public String toString(){
    //     StringBuilder sb = new StringBuilder();
    //     sb.append(name + " - " + payment());
    //     return sb.toString();
    // }


}
