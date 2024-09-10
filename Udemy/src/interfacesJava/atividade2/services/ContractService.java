package interfacesJava.atividade2.services;

import java.time.LocalDate;

import interfacesJava.atividade2.entities.Contract;
import interfacesJava.atividade2.entities.Installment;
import interfacesJava.atividade2.services.interfacePaymentService.OnlinePaymentService;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {

        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = fee + interest + basicQuota;

            contract.getInstallment().add(new Installment(dueDate, quota));
        }
    }
}
