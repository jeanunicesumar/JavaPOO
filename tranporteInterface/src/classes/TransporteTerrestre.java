package classes;

import inteface.Transportadora;

public class TransporteTerrestre implements Transportadora {
    @Override
    public double calculaFrete(double altura, double largura) {
        if (altura == 0 || largura == 0) {
            return 0;
        }
        return (altura / largura) * 0.2;
    }
}
