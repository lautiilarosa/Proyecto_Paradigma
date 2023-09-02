package Entidades;

public class Crianza extends EtapasElaboracion implements Barriles{
    private Bodega cantBarriles;
    // Constructor
    public Crianza(){
    }
    public Crianza(Bodega bodega) {
        this.cantBarriles = bodega;
    }

    public int getCantBarriles() {
        return cantBarriles.getCantBarriles();
    }
    

}
