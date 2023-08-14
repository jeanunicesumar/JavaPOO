package classes;

import inteface.Transportadora;

public class TransporteNautico implements Transportadora {
    @Override
    public double calculaFrete(double altura, double largura) {
        return (altura + largura) * 0.1;
    }
}
