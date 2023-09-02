package Entidades;

public class Traslado extends EtapasElaboracion implements Camiones {
    private Bodega cantCamiones;
    // Constructor
    public Traslado(){
    }
    public Traslado(Bodega bodega) {
        this.cantCamiones = bodega;
    }

    public int getCantCamiones() {
        return cantCamiones.getCantCamiones();
    }

}
