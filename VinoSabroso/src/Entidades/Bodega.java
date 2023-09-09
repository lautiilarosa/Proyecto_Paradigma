package Entidades;
import java.util.ArrayList;
import Entidades.Uvas.Uva;
import Entidades.Vino;
/**
 * Clase Bodega para guardar los datos ingresados por el usuario
 * @version 1.0, 7/9/2023
 * @author Paulina Suden
 */
public class Bodega {
    public static ArrayList<Uva> uvasIngresadas;
    public static ArrayList<Vino> listaVinos;
    private int mesIngresado;

    /**
     * @param uvasIngresadas guarda un ArrayList con las características de todas las uvas ingresadas
     * @param mesIngresado guarda el mes que ingresó el usuario
     * @param listaVinos guarda todos los objetos Vinos ingresados por el usuario
     */

    //Constructor
    public Bodega(ArrayList<Uva> uvasIngresadas, int mesIngresado, ArrayList<Vino> listaVinos) {
        this.uvasIngresadas = uvasIngresadas;
        this.mesIngresado = mesIngresado;
        this.listaVinos = listaVinos;

    }

    //Getters

    public ArrayList<Uva> getUvasIngresadas() {return uvasIngresadas;}

    public ArrayList<Vino> getListaVinos(){return listaVinos;}


    public int getMesIngresado() {
        return mesIngresado;
    }

    public void setMesIngresado(int mesIngresado) {
        this.mesIngresado = mesIngresado;
    }

    public static void agregarUva (Uva nuevaUva){
        uvasIngresadas.add(nuevaUva);
    }

    public static void agregarVino(Vino nuevoVino){
        listaVinos.add(nuevoVino);
    }

}