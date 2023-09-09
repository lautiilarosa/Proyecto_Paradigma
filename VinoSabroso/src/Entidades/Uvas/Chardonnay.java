package Entidades.Uvas;
/**
 * Clase Chardonnay que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class Chardonnay extends Uva {
    public Chardonnay(){
        nombreUva = "Chardonnay";
        tipoUva = "Blanca";
        aparienciaVisual = "Amarillo Pálido";
        aroma = "Frutos frescos";
        intensidad = "Moderada";
        cuerpo = "Ligero y fresco";
        sabor = "Frutas blancas y tropicales";
        maridaje = "Platos de mariscos";
        enumUva = TiposUva.CHARDONNAY;
    }
}
