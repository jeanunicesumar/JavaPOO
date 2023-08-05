public class TransporteTerrestre extends Transportadora {
    @Override
    public double calculaFrete(double altura, double largura) {
        if (altura == 0 || largura == 0) {
            return 0;
        }
        return (altura / largura) * 0.2;
    }
}
