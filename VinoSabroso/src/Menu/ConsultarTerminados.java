package Menu;

import Entidades.EtapasEnum;
import Entidades.Vino;

import java.util.ArrayList;

public class ConsultarTerminados {

    public static void consultarEtapaT(ArrayList<Vino> listaVinos) {
        ConsultarTerminados obj = new ConsultarTerminados();
        obj.consultarEtapa(listaVinos); // Llamada de instancia desde el objeto
    }

    public void consultarEtapa(ArrayList<Vino> listaVinos){
        boolean terminados=false;
        for (Vino vino : listaVinos){
            if (vino.getEtapa() == 10){
                System.out.println(vino.uva.getNombreUva() +" de id "+vino.getId()+" está terminado.");
                terminados = true;
            }
        }
        if (!terminados){
            System.out.println("No hay vinos terminados");
        }

    }
}
