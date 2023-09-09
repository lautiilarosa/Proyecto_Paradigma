package Menu;
import Entidades.EtapasEnum;
import Entidades.Vino;
import Interfaces.IConsultarEtapaActual;

import java.util.ArrayList;

public class ConsultarEtapaActual implements IConsultarEtapaActual {
    //Constructor
    public static void consultarEtapaActual(){}

    /**
     * Método consultarEtapa() para informarle al usuario la etapa actual de elaboración de una uva en específico
     * @version 1.1, 9/9/2023
     * @author Paulina Suden  */

    public static void consultarEtapaS(ArrayList<Vino> listaVinos) {
        ConsultarEtapaActual obj = new ConsultarEtapaActual();
        obj.consultarEtapa(listaVinos); // Llamada de instancia desde el objeto
    }

    public void consultarEtapa(ArrayList<Vino> listaVinos){
        for (Vino vino : listaVinos){
            EtapasEnum etapa = EtapasEnum.values()[vino.getEtapa()-1];
            System.out.println("Etapa actual de elaboración del vino " +vino.uva.getNombreUva() +" de id "+vino.getId() +" es: " +etapa);
        }
    }


}
