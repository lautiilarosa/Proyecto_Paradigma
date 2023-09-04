package Entidades;
import Interfaces.Botellas;

public class Embotellamiento extends EtapasElaboracion implements Botellas {
    //Atributos
    private String tipoBotella;
    private Bodega cantBotellas;

    //Constructor
    public Embotellamiento(String tipoBotella, Bodega bodega,int turno){
        super(turno);
        this.tipoBotella=tipoBotella;
        this.cantBotellas = bodega;
    }
    public Embotellamiento() {
    }

    //Getters y Setters
    public String getTipoBotella(){
        return tipoBotella;}
    public void setTipoBotella(String tipoBotella){
        this.tipoBotella=tipoBotella;}
    public int getCantBotellas() {
        return cantBotellas.getCantBotellas();
    }

}
