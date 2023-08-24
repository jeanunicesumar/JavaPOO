package automovel;

import java.util.concurrent.TimeUnit;

public class Automovel {
    private TipoAutomovel tipoAutomovel;
    private Double valor;

    public Automovel(TipoAutomovel tipoAutomovel, Double valor) {
        this.tipoAutomovel = tipoAutomovel;
        this.valor = valor;
    }

    public TipoAutomovel getTipoAutomovel() {
        return tipoAutomovel;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "tipoAutomovel=" + tipoAutomovel +
                ", valor=" + valor +
                '}';
    }
}
