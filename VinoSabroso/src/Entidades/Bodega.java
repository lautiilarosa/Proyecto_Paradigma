package Entidades;
import java.util.ArrayList;
import Entidades.Uvas.Uva;
/**
 * Clase Bodega para guardar los datos ingresados por el usuario
 * @version 1.0, 7/9/2023
 * @author Paulina Suden
 */
public class Bodega {
    private ArrayList<Uva> uvasIngresadas;
    private int mesIngresado;

    /**
     * @param uvasIngresadas guarda un ArrayList con las características de todas las uvas ingresadas
     * @param mesIngresado guarda el mes que ingresó el usuario
     */

    //Constructor
    public Bodega(ArrayList<Uva> uvasIngresadas, int mesIngresado) {
        this.uvasIngresadas = uvasIngresadas;
        this.mesIngresado = mesIngresado;

    }

    //Getters
    public ArrayList<Uva> getUvasIngresadas() {
        return uvasIngresadas;
    }

    public int getMesIngresado() {
        return mesIngresado;
    }

    public void setMesIngresado(int mesIngresado) {
        this.mesIngresado = mesIngresado;
    }

    //public void setUvasIngresadas(ArrayList<Uva> uvasIngresadas) { this.uvasIngresadas = uvasIngresadas; }
}