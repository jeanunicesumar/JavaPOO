package automovel;

public enum TipoAutomovel {
    PASSEIO("Passeio") {
        @Override
        public Double calculaJuros(Automovel automovel) {
            return automovel.getValor() * 1.12;
        }
    },
    PROFISSIONAL("Uso profissional") {
        @Override
        public Double calculaJuros(Automovel automovel) {
            return automovel.getValor() * 1.143;
        }
    },
    TRANSPORTE("Ônibus / Vans") {
        @Override
        public Double calculaJuros(Automovel automovel) {
            return automovel.getValor() * 1.135;
        }
    },
    CARGA("Caminhão") {
        @Override
        public Double calculaJuros(Automovel automovel) {
            return automovel.getValor() * 1.8;
        }
    };

    private String descricaoVeiculo;

    TipoAutomovel(String descricaoVeiculo) {
        this.descricaoVeiculo = descricaoVeiculo;
    };

    public String getDescricaoVeiculo() {
        return descricaoVeiculo;
    }

    public abstract Double calculaJuros(Automovel automovel);

}
