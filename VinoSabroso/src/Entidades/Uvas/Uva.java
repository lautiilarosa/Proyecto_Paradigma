package Entidades.Uvas;

/**
 * Clase Abstracta Uva en donde definimos como atributo las características de cada uva
 * @version 1.0,07/09/2023
 * @author Lautaro Larosa
 */

public abstract class Uva{
    protected static TiposUva enumUva;
    protected static String nombreUva;
    protected static String tipoUva;
    protected static String aparienciaVisual;
    protected static String aroma;
    protected static String intensidad;
    protected static String cuerpo;
    protected static String sabor;
    protected static String maridaje;

    public String getNombreUva() { return nombreUva; }
    public String getTipoUva() {return tipoUva;}
    public String getAparienciaVisual() {
        return aparienciaVisual;
    }
    public String getAroma() {
        return aroma;
    }
    public String getIntensidad() {
        return intensidad;
    }
    public String getCuerpo() {
        return cuerpo;
    }
    public String getSabor() {
        return sabor;
    }
    public String getMaridaje() {
        return maridaje;
    }
    public TiposUva getEnumUva(){ return enumUva;}

    /**
     * Método Público sin parámetros ni return en donde imprimimos las características de la uva
     */
    public void imprimirInformacion(){
        System.out.println("Características de la Uva "+getNombreUva()+": ");
        System.out.println("");
        System.out.println("1-Tipo de Uva: "+getTipoUva());
        System.out.println("2-Apariencia Visual: " +getAparienciaVisual());
        System.out.println("3-Aroma: "+getAroma());
        System.out.println("4-Intensidad: "+getIntensidad());
        System.out.println("5-Cuerpo: "+getCuerpo());
        System.out.println("6-Sabor: "+getSabor());
        System.out.println("7-Maridaje: "+getMaridaje());
    }

}
