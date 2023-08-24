package pessoa;

import automovel.Automovel;
import estacionamento.Estacionamento;

public class Motorista extends Pessoa {
    private Automovel automovel;
    private Estacionamento estacionamento;

    public Motorista(EstadoCivil estadoCivil, Automovel automovel) {
        super(estadoCivil);
        this.automovel = automovel;
    }

    public Motorista(EstadoCivil estadoCivil, Automovel automovel, Estacionamento estacionamento) {
        super(estadoCivil);
        this.automovel = automovel;
        this.estacionamento = estacionamento;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    @Override
    public String toString() {
        return "Automovel" + this.automovel;
    }
}
