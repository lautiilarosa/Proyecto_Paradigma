import Entidades.Vino;
import Entidades.Uvas.Malbec;
import Menu.CambiarEtapa;
import Menu.ConsultarEtapaActual;
public class PauliMain {
    public static void main(String[] args) {
        Malbec malbec = new Malbec();
        Vino vino1 = new Vino(1, malbec, 5);
        CambiarEtapa etapa = new CambiarEtapa();
        etapa.cambiarDeEtapa(vino1);
        ConsultarEtapaActual consultaEtapa = new ConsultarEtapaActual();
    }
}
