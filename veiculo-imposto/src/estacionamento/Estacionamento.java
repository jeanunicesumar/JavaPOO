package estacionamento;

public class Estacionamento {
    private Boolean isAutomatico;

    public Estacionamento(Boolean isAutomatico) {
        this.isAutomatico = isAutomatico;
    }

    public Boolean isAutomatico() {
        return isAutomatico;
    }
}
