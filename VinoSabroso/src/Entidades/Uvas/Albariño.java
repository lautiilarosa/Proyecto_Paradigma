package Entidades.Uvas;
/**
 * Clase Albariño que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class Albariño extends Uva{
    public Albariño(){
        nombreUva = "Albariño";
        tipoUva = "Blanca";
        aparienciaVisual = "Amarillo Pálido";
        aroma = "Flores Blancas";
        intensidad = "Moderada";
        cuerpo = "Ligero a medio";
        sabor = "Cítricos y frutales";
        maridaje = "Frutas del mar y carnes blancas";
        enumUva = TiposUva.Albariño;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("La uva "+nombreUva+" tiene las siguientes características:");
        System.out.println("");
        super.imprimirInformacion();
    }
}
