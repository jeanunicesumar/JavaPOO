import automovel.Automovel;
import automovel.TipoAutomovel;
import pessoa.EstadoCivil;
import pessoa.Motorista;

public class Main {
    public static void main(String[] args) {
        Automovel automovel = new Automovel(TipoAutomovel.PASSEIO, 10.000);
        Motorista motorista = new Motorista(EstadoCivil.CASADO, automovel);

        System.out.println(motorista);

    }
}