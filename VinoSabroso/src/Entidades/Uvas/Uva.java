package Entidades.Uvas;

/**
 * Clase Abstracta Uva en donde definimos como atributo las características de cada uva
 * @version 1.0,07/09/2023
 * @author Lautaro Larosa
 */

public abstract class Uva{
    protected String tipoUva;
    protected int[] fechaCrianza;
    protected String aparienciaVisual;
    protected String aroma;
    protected String intensidad;
    protected String cuerpo;
    protected String sabor;
    protected String maridaje;

    /**
     * Método Público sin parámetros ni return en donde imprimimos las características de la uva
     */
    public void imprimirInformacion(){
        System.out.println("Características de la Uva");
        System.out.println("");
        System.out.println("1-Tipo de Uva: "+tipoUva);
        System.out.println("2-Apariencia Visual: " +aparienciaVisual);
        System.out.println("3-Aroma: "+aroma);
        System.out.println("4-Intensidad: "+intensidad);
        System.out.println("5-Cuerpo: "+cuerpo);
        System.out.println("6-Sabor: "+sabor);
        System.out.println("7-Maridaje: "+maridaje);
    }

}
