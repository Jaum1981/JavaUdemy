package interfacesJava.atividade2.services.interfacePaymentService;

public interface OnlinePaymentService {
    
    public double paymentFee(double amount);
    public double interest(double amount, int months);
}
