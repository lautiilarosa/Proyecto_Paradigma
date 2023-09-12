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
    public static ArrayList<Vino> listaVinos;
    private int mesIngresado;

    /**
     * @param mesIngresado guarda el mes que ingresó el usuario
     * @param listaVinos guarda todos los objetos Vinos ingresados por el usuario
     */

    //Constructor
    public Bodega(int mesIngresado, ArrayList<Vino> listaVinos) {
        this.mesIngresado = mesIngresado;
        this.listaVinos = listaVinos;

    }

    /**
     * Constructor vacío
     */
    public Bodega(){

    }

    //Getters

    public ArrayList<Vino> getListaVinos(){return listaVinos;}


    public int getMesIngresado() {
        return mesIngresado;
    }

    public void setMesIngresado(int mesIngresado) {
        this.mesIngresado = mesIngresado;
    }


    public static void agregarVino(Vino nuevoVino){
        listaVinos.add(nuevoVino);
    }


    /**
     * El método mostrarVino() nos muestra por pantalla todos los vinos ingresados
     * Con el id y el nombre de la uva del respectivo vino
     * @version 1.0 , 11/09/2023
     */
    public static void mostrarVino(){ //Hacer mas bonito
        System.out.println("Vinos ingresados: ");
        for (Vino vino :listaVinos){
            System.out.println("Id: "+vino.getId()+" ,nombre: "+vino.uva.getNombreUva());
        }
    }

}