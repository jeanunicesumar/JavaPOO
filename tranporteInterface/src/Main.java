import classes.TransporteNautico;
import classes.TransporteTerrestre;
import inteface.Transportadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Transportadora transporteTerrestre = new TransporteTerrestre();
        Transportadora transporteNautico = new TransporteNautico();

        double freteTransporteTerrestre = transporteTerrestre.calculaFrete(10, 12);
        double freteTransporteNautico = transporteNautico.calculaFrete(10, 12);

        System.out.printf("Valor do frete terrestre: %.2f\n", freteTransporteTerrestre);
        System.out.printf("Valor do frete náutico: %.2f", freteTransporteNautico);
    }
}