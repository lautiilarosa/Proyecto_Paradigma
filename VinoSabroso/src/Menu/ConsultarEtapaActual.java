package Menu;
import Entidades.EtapasEnum;
import Entidades.Vino;

public class ConsultarEtapaActual {
    //Constructor
    public static void consultarEtapaActual(){}

    /**
     * Método consultarEtapa() para informarle al usuario la etapa actual de elaboración de una uva en específico
     * @version 1.0, 8/9/2023
     * @author Paulina Suden  */
    public void consultarEtapa(Vino vino) {
        EtapasEnum etapa = EtapasEnum.values()[vino.getEtapa()-1];
        System.out.println("Etapa actual de elaboración del vino " +vino.uva.getTipoUva() +" es: " +etapa);
    }  ///AGREGAR NOMBRE DE LA UVA EN CARACTERISTICAS UVAS
}
