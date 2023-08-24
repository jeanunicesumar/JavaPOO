package pessoa;

import automovel.Automovel;

public enum EstadoCivil {
    SOLTEIRO("Solteiro") {
        @Override
        public Double calculaValor(Automovel automovel) {
            return automovel.getValor() * 1.8;
        }
    },
    DIVORCIADO("Divorciado") {
        @Override
        public Double calculaValor(Automovel automovel) {
            return automovel.getValor() * 1.8;
        }
    },
    CASADO("Casado") {
        @Override
        public Double calculaValor(Automovel automovel) {
            return automovel.getValor() * 0.025;
        }
    },
    UNIAO_ESTAVEL("União estável") {
        @Override
        public Double calculaValor(Automovel automovel) {
            return automovel.getValor() * 0.025;
        }
    },
    VIUVO("Viúvo") {
        @Override
        public Double calculaValor(Automovel automovel) {
            return automovel.getValor() * 0.025;
        }
    };

    private String descricaoEstadoCivil;
    public abstract Double calculaValor(Automovel automovel);

    EstadoCivil(String descricaoEstadoCivil) {
        this.descricaoEstadoCivil = descricaoEstadoCivil;
    }

    public String getDescricaoEstadoCivil() {
        return this.descricaoEstadoCivil;
    }

}
