package Entidades;

public class Embotellamiento extends EtapasElaboracion implements Botellas{
    //Atributos
    private String tipoBotella;
    private Bodega cantBotellas;

    //Constructor
    public Embotellamiento(String tipoBotella){
        this.tipoBotella=tipoBotella;
    }
    public Embotellamiento(Bodega bodega) {
        this.cantBotellas = bodega;
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
