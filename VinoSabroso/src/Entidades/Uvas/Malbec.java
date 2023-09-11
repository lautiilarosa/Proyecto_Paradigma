package Entidades.Uvas;
/**
 * Clase Malbec que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class Malbec extends Uva{
    public Malbec(){
        nombreUva = "Malbec";
        tipoUva = "Tinta";
        aparienciaVisual = "Rojo Oscuro y Púrpura";
        aroma = "Frutas negras";
        intensidad = "Media-Alta";
        cuerpo = "Medio-Completo";
        sabor = "Frutas negras";
        maridaje = "Carnes rojas a la parilla";
        enumUva = TiposUva.Malbec;
    }
}
