package Entidades;
import java.util.ArrayList;

public class Bodega {
    private ArrayList<String> uvasDisponibles;
    private ArrayList<String> uvasNoDisponibles;
    private int mesActual;
    private int cantCamiones;
    private int cantBotellas;
    private int cantBarriles;
    private Vino[] vinos;

    //Constructor
    public Bodega(ArrayList<String> uvasDisponibles, int mesActual, int cantCamiones, int cantBotellas, int cantBarriles,Vino[] vinos) {
        this.uvasDisponibles = uvasDisponibles;
        this.mesActual = mesActual;
        this.cantCamiones = cantCamiones;
        this.cantBotellas = cantBotellas;
        this.cantBarriles = cantBarriles;
        this.vinos = vinos;
    }

    public ArrayList<String> getUvasNoDisponibles() {
        return uvasNoDisponibles;
    }

    public void setUvasNoDisponibles(ArrayList<String> uvasNoDisponibles) {
        this.uvasNoDisponibles = uvasNoDisponibles;
    }

    public ArrayList<String> getUvasDisponibles() {
        return uvasDisponibles;
    }

    public void setUvasDisponibles(ArrayList<String> uvasDisponibles) {
        this.uvasDisponibles = uvasDisponibles;
    }

    public int getMesActual() {
        return mesActual;
    }

    public void setMesActual(int mesActual) {
        this.mesActual = mesActual;
    }

    public int getCantCamiones() {
        return cantCamiones;
    }

    public void setCantCamiones(int cantCamiones) {
        this.cantCamiones = cantCamiones;
    }

    public int getCantBotellas() {
        return cantBotellas;
    }

    public void setCantBotellas(int cantBotellas) {
        this.cantBotellas = cantBotellas;
    }

    public int getCantBarriles() {
        return cantBarriles;
    }

    public void setCantBarriles(int cantBarriles) {
        this.cantBarriles = cantBarriles;
    }

    public Vino[] getVinos() {
        return vinos;
    }

    public void setVinos(Vino[] vinos) {
        this.vinos = vinos;
    }
}
