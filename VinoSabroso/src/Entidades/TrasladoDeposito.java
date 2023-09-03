package Entidades;
import Interfaces.Camiones;

public class TrasladoDeposito extends EtapasElaboracion implements Camiones{
    private Bodega cantCamiones;

    // Constructor
    public TrasladoDeposito(){
    }
    public TrasladoDeposito(Bodega bodega,int turno) {
        super(turno);
        this.cantCamiones = bodega;
    }

    //Getter?
    public int getCantCamiones() {
        return cantCamiones.getCantCamiones();
    }

}
