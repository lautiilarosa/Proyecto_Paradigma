package Entidades;

public class TrasladoDeposito extends EtapasElaboracion implements Camiones{
    private Bodega cantCamiones;

    // Constructor
    public TrasladoDeposito(){
    }
    public TrasladoDeposito(Bodega bodega) {
        this.cantCamiones = bodega;
    }

    //Getter?
    public int getCantCamiones() {
        return cantCamiones.getCantCamiones();
    }

}
