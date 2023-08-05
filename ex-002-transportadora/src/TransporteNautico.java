public class TransporteNautico extends Transportadora {
    @Override
    public double calculaFrete(double altura, double largura) {
        return (altura + largura) * 0.1;
    }
}
