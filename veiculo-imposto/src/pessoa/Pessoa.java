package pessoa;

import estacionamento.Estacionamento;

public abstract class Pessoa {
    private EstadoCivil estadoCivil;

    public Pessoa(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
}
