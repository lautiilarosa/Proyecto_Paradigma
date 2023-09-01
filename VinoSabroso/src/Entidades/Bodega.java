package Entidades;

public class Bodega {
    private boolean[] uvasDisponibles;
    public int mesActual;
    public int cantCamiones;
    public int cantBotellas;
    public int cantBarriles;
    public int cantToneles;
    public Vino[] vinos;

    //Constructor
    public Bodega(boolean[] uvasDisponibles, int mesActual, int cantCamiones, int cantBotellas, int cantBarriles, int cantToneles, Vino[] vinos) {
        this.uvasDisponibles = uvasDisponibles;
        this.mesActual = mesActual;
        this.cantCamiones = cantCamiones;
        this.cantBotellas = cantBotellas;
        this.cantBarriles = cantBarriles;
        this.cantToneles = cantToneles;
        this.vinos = vinos;
    }

    public boolean[] getUvasDisponibles() {
        return uvasDisponibles;
    }

    public void setUvasDisponibles(boolean[] uvasDisponibles) {
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

    public int getCantToneles() {
        return cantToneles;
    }

    public void setCantToneles(int cantToneles) {
        this.cantToneles = cantToneles;
    }

    public Vino[] getVinos() {
        return vinos;
    }

    public void setVinos(Vino[] vinos) {
        this.vinos = vinos;
    }
}
