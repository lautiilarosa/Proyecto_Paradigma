package Entidades;
import Interfaces.Camiones;
public class Traslado extends EtapasElaboracion implements Camiones {
    private Bodega cantCamiones;
    // Constructor
    public Traslado(){
    }
    public Traslado(Bodega bodega, int turno) {
        super(turno);
        this.cantCamiones = bodega;
    }

    public int getCantCamiones() {
        return cantCamiones.getCantCamiones();
    }

}
