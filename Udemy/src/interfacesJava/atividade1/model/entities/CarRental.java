package interfacesJava.atividade1.model.entities;

import java.time.LocalDateTime;

public class CarRental {
    
    private LocalDateTime start;
    private LocalDateTime finish;

    private Veiculo veiculo;
    private InVoice inVoice;

    public CarRental(LocalDateTime start, LocalDateTime finish, Veiculo veiculo) {
        this.start = start;
        this.finish = finish;
        this.veiculo = veiculo;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public InVoice getInVoice() {
        return inVoice;
    }

    public void setInVoice(InVoice inVoice) {
        this.inVoice = inVoice;
    }
    
    

}
