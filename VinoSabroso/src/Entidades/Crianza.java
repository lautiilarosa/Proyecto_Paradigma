package Entidades;

public class Crianza extends EtapasElaboracion {
    private Bodega cantBarriles;
    // Constructor
    public Crianza(){
    }
    public Crianza(int turno){
        super(turno);
    }
    public Crianza(Bodega bodega) {
        this.cantBarriles = bodega;
    }

    public int getCantBarriles() {
        return cantBarriles.getCantBarriles();
    }
    

}
