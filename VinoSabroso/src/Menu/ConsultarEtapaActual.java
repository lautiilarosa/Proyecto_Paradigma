package Menu;
import Entidades.EtapasEnum;
import Entidades.Vino;

import java.util.ArrayList;

public class ConsultarEtapaActual {
    //Constructor
    public static void consultarEtapaActual(){}

    /**
     * Método consultarEtapa() para informarle al usuario la etapa actual de elaboración de una uva en específico
     * @version 1.1, 9/9/2023
     * @author Paulina Suden  */
    public static void consultarEtapa(ArrayList<Vino> listaVino) {
        for (Vino vinos : listaVino){
            EtapasEnum etapa = EtapasEnum.values()[vinos.getEtapa()-1];
            System.out.println("Etapa actual de elaboración del vino " +vinos.uva.getNombreUva() +" es: " +etapa);
        }
    }
}
